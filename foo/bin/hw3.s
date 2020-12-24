	.section .test
	.global main
	.type main,%function
main:
	mov r0, #100
	mov r1, 0x77
	AND r2, r1, r0
	AND r3, r1, r0, LSR #8
	AND r3, r1, r0, LSR #15
	nop
	.end
