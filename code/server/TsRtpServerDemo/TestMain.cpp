//============================================================================
// Name        : TsRtpServerDemo.cpp
// Author      : pix
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C, Ansi-style
//============================================================================

#include <stdio.h>
#include <stdlib.h>
#include "test_ts_rtp_server.h"


int main(int argc,char ** argv) {
	puts("Hello World!!!");
	if(argc != 2)
	{
		test_ts_rtp_server();
	}
	test_ts_rtp_server(argv[1]);
	return EXIT_SUCCESS;
}
