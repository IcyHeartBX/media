#!/bin/bash
mkfifo fifo.ts  
ffmpeg -i $1 -y fifo.ts &  
./TsRtpServerDemo fifo.ts 
