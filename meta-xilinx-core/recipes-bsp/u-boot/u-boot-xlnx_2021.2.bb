UBOOT_VERSION = "v2021.01"

UBRANCH ?= "xlnx_rebase_v2021.01"

SRCREV = "63b6d260dbe64a005407439e2caeb32da9025954"

include u-boot-xlnx.inc
include u-boot-spl-zynq-init.inc

LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM = "file://README;beginline=1;endline=4;md5=744e7e3bb0c94b4b9f6b3db3bf893897"

# u-boot-xlnx has support for these
HAS_PLATFORM_INIT ?= " \
		xilinx_zynqmp_virt_config \
		xilinx_zynq_virt_defconfig \
		xilinx_versal_vc_p_a2197_revA_x_prc_01_revA \
		"

