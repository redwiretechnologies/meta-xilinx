inherit features_check

REQUIRED_DISTRO_FEATURES = "spips"

inherit esw python3native

DEPENDS += "xilstandalone "

ESW_COMPONENT_SRC = "/XilinxProcessorIPLib/drivers/spips/src/"
ESW_COMPONENT_NAME = "libspips.a"

addtask do_generate_driver_data before do_configure after do_prepare_recipe_sysroot
do_prepare_recipe_sysroot[rdeptask] = "do_unpack"
