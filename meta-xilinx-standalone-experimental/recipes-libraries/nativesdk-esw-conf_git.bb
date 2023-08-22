# Can't depend on esw since this is needed for setup!
inherit xlnx-embeddedsw nativesdk

# We need to override the inherit
require conf/dtb-embeddedsw.inc

S = "${WORKDIR}/git"
B = "${WORKDIR}/build"

# Don't need any specific dependencies for this
DEPENDS = ""

COMPATIBLE_HOST:forcevariable = ".*"

ESW_COMPONENT_SRC = "/XilinxProcessorIPLib/drivers/"

do_configure[noexec] = '1'
do_compile[noexec] = '1'

do_install() {
    # The configuration step requires only the yaml files, make them
    # available to the SDK
    cd ${S}${ESW_COMPONENT_SRC}
    for each in `find . -name *.yaml` ; do
        mkdir -p $(dirname ${D}/${datadir}/embeddedsw${ESW_COMPONENT_SRC}$each)
        install -m 0644 $each ${D}/${datadir}/embeddedsw${ESW_COMPONENT_SRC}$each
    done
}

FILES:${PN} += "${datadir}/embeddedsw"
