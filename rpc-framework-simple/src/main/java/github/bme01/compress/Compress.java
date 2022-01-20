package github.bme01.compress;

import github.bme01.extension.SPI;


@SPI
public interface Compress {

    byte[] compress(byte[] bytes);


    byte[] decompress(byte[] bytes);
}
