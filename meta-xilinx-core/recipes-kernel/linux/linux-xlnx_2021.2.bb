LINUX_VERSION = "5.10.0"
KBRANCH="xlnx_rebase_v5.10"
SRCREV = "87ec9a2d98a7a7dfc98b57348a0ec310fd170e4b"

KCONF_AUDIT_LEVEL="0"

include linux-xlnx.inc

FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"
