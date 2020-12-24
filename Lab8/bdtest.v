`timescale 1ns / 1ps

////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer:
//
// Create Date:   15:04:06 05/13/2014
// Design Name:   id
// Module Name:   E:/id/idtest.v
// Project Name:  id
// Target Device:  
// Tool versions:  
// Description: 
//
// Verilog Test Fixture created by ISE for module: id
//
// Dependencies:
// 
// Revision:
// Revision 0.01 - File Created
// Additional Comments:
// 
////////////////////////////////////////////////////////////////////////////////

module bdtest;

	// Inputs
	reg clk;
	reg ret;
	reg rdy;
	// Outputs
	wire a;
	wire b;
	wire c;
	wire d;
	wire e;
	wire f;
	wire g;
	wire [6:0]L;
	assign L = { a, b, c, d, e, f, g};

	// Instantiate the Unit Under Test (UUT)
	bd uut (
		.clk(clk), 
		.ret(ret), 
		.a(a), 
		.b(b), 
		.c(c), 
		.d(d), 
		.e(e), 
		.f(f), 
		.g(g)
	);

	initial begin
		//$sdf_anotated("bd_gate.sdf", uut);
		// Initialize Inputs
		clk = 0;
		ret = 0;
		//$dumpfile("lab12_7seg.fsdb");
		//$dumpvars;

		#10 ret = 1;

		#10 ret = 0;

		#1000000	$finish;
	end

	initial begin
	$dumpfile("bd.vcd");
	$dumpvars;
	end
	
	always #2 clk = ~clk;
	
	always @(posedge clk or posedge ret)
	begin
			case(L)
				7'b0000001:  $display ("0\n");
				7'b1001111:  $display ("1\n");
				7'b0010010:  $display ("2\n");
				7'b0000110:  $display ("3\n");
				7'b1001100:  $display ("4\n");
				7'b0100100:  $display ("5\n");
				7'b1100000:  $display ("6\n");
				7'b0001111:  $display ("7\n");
				7'b0000000:  $display ("8\n");
				7'b0001100:  $display ("9\n");
			endcase
	end

endmodule