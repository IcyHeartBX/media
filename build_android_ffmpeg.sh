cd ffmpeg-3.2.4 
  
make clean  
  
export NDK=/usr/local/android-ndk-r13b
export PREBUILT=$NDK/toolchains/arm-linux-androideabi-4.9/prebuilt  
export PLATFORM=$NDK/platforms/android-9/arch-arm  
export PREFIX=../simplefflib
build_one(){  
  ./configure --target-os=linux --prefix=$PREFIX \  
--enable-cross-compile \  
--enable-runtime-cpudetect \  
--disable-asm \  
--arch=arm \  
--cc=$PREBUILT/linux-x86_64/bin/arm-linux-androideabi-gcc \  
--cross-prefix=$PREBUILT/linux-x86_64/bin/arm-linux-androideabi- \  
--disable-stripping \  
--nm=$PREBUILT/linux-x86_64/bin/arm-linux-androideabi-nm \  
--sysroot=$PLATFORM \  
--enable-gpl --enable-shared --disable-static --enable-small \  
--disable-ffprobe --disable-ffplay --disable-ffmpeg --disable-ffserver --disable-debug \  
--extra-cflags="-fPIC -DANDROID -D__thumb__ -mthumb -Wfatal-errors -Wno-deprecated -mfloat-abi=softfp -marm -march=armv7-a"   
}  
  
build_one  
echo "configure end...."  
make  
make install  
  
cd .. 
