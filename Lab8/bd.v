`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date:    15:03:17 05/13/2014 
// Design Name: 
// Module Name:    id 
// Project Name: 
// Target Devices: 
// Tool versions: 
// Description: 
//
// Dependencies: 
//
// Revision: 
// Revision 0.01 - File Created
// Additional Comments: 
//
//////////////////////////////////////////////////////////////////////////////////
module bd(
	input clk,
    input ret,
    output a,
    output b,
    output c,
    output d,
    output e,
    output f,
    output g
    );

	reg [6:0] L;
	reg [31:0] count;

	assign {a, b, c, d, e, f, g} = L;


	always@(posedge clk or posedge ret)	
	begin
		if(ret)
			count <= 32'd0;
		else
		begin
				count <= count + 32'd1;
		end
	end

	always@(posedge clk or posedge ret)
	begin
		if(ret)
			L <= 7'b0000001;
		else
		begin
			case(count)
				32'd0	: L <= 7'b1001111;
				32'd1	: L <= 7'b0001100;
				32'd2	: L <= 7'b0001100;
				32'd3	: L <= 7'b0010010;
				32'd4	: L <= 7'b0000001;
				32'd5	: L <= 7'b0001100;
				32'd6	: L <= 7'b0000001;
				32'd7	: L <= 7'b0000110;

				default : L <= 7'b0000000;
			endcase
		end
	end

endmodule
