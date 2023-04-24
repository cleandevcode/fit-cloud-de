package no.nordicsemi.android.dfu.internal;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import no.nordicsemi.android.dfu.internal.exception.HexFileValidationException;

/* loaded from: classes2.dex */
public class HexInputStream extends FilterInputStream {
    private final int LINE_LENGTH;
    private final int MBRSize;
    private final int available;
    private int bytesRead;
    private int lastAddress;
    private final byte[] localBuf;
    private int localPos;
    private int pos;
    private int size;

    public HexInputStream(InputStream inputStream, int i10) {
        super(new BufferedInputStream(inputStream));
        this.LINE_LENGTH = 128;
        byte[] bArr = new byte[128];
        this.localBuf = bArr;
        this.localPos = 128;
        this.size = bArr.length;
        this.lastAddress = 0;
        this.MBRSize = i10;
        this.available = calculateBinSize(i10);
    }

    public HexInputStream(byte[] bArr, int i10) {
        super(new ByteArrayInputStream(bArr));
        this.LINE_LENGTH = 128;
        byte[] bArr2 = new byte[128];
        this.localBuf = bArr2;
        this.localPos = 128;
        this.size = bArr2.length;
        this.lastAddress = 0;
        this.MBRSize = i10;
        this.available = calculateBinSize(i10);
    }

    private int asciiToInt(int i10) {
        if (i10 >= 65) {
            return i10 - 55;
        }
        if (i10 >= 48) {
            return i10 - 48;
        }
        return -1;
    }

    private int calculateBinSize(int i10) {
        int readAddress;
        InputStream inputStream = ((FilterInputStream) this).in;
        inputStream.mark(inputStream.available());
        try {
            int read = inputStream.read();
            int i11 = 0;
            int i12 = 0;
            while (true) {
                checkComma(read);
                int readByte = readByte(inputStream);
                int readAddress2 = readAddress(inputStream);
                int readByte2 = readByte(inputStream);
                if (readByte2 != 0) {
                    if (readByte2 == 1) {
                        return i12;
                    }
                    if (readByte2 == 2) {
                        readAddress = readAddress(inputStream) << 4;
                        if (i12 > 0 && (readAddress >> 16) != (i11 >> 16) + 1) {
                            return i12;
                        }
                        skip(inputStream, 2L);
                    } else if (readByte2 == 4) {
                        int readAddress3 = readAddress(inputStream);
                        if (i12 > 0 && readAddress3 != (i11 >> 16) + 1) {
                            return i12;
                        }
                        readAddress = readAddress3 << 16;
                        skip(inputStream, 2L);
                    }
                    i11 = readAddress;
                    while (true) {
                        read = inputStream.read();
                        if (read != 10 || read == 13) {
                        }
                    }
                } else if (readAddress2 + i11 >= i10) {
                    i12 += readByte;
                }
                skip(inputStream, (readByte * 2) + 2);
                while (true) {
                    read = inputStream.read();
                    if (read != 10) {
                    }
                }
            }
        } finally {
            inputStream.reset();
        }
    }

    private void checkComma(int i10) {
        if (i10 != 58) {
            throw new HexFileValidationException("Not a HEX file");
        }
    }

    private int readAddress(InputStream inputStream) {
        return readByte(inputStream) | (readByte(inputStream) << 8);
    }

    private int readByte(InputStream inputStream) {
        return asciiToInt(inputStream.read()) | (asciiToInt(inputStream.read()) << 4);
    }

    private int readLine() {
        int readAddress;
        int i10;
        if (this.pos == -1) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        while (true) {
            int read = inputStream.read();
            this.pos++;
            if (read != 10 && read != 13) {
                checkComma(read);
                int readByte = readByte(inputStream);
                this.pos += 2;
                int readAddress2 = readAddress(inputStream);
                this.pos += 4;
                int readByte2 = readByte(inputStream);
                int i11 = this.pos + 2;
                this.pos = i11;
                if (readByte2 != 0) {
                    if (readByte2 == 1) {
                        this.pos = -1;
                        return 0;
                    }
                    if (readByte2 == 2) {
                        readAddress = readAddress(inputStream) << 4;
                        i10 = this.pos + 4;
                        this.pos = i10;
                        if (this.bytesRead > 0 && (readAddress >> 16) != (this.lastAddress >> 16) + 1) {
                            return 0;
                        }
                    } else if (readByte2 != 4) {
                        this.pos = (int) (i11 + skip(inputStream, (readByte * 2) + 2));
                    } else {
                        int readAddress3 = readAddress(inputStream);
                        i10 = this.pos + 4;
                        this.pos = i10;
                        if (this.bytesRead > 0 && readAddress3 != (this.lastAddress >> 16) + 1) {
                            return 0;
                        }
                        readAddress = readAddress3 << 16;
                    }
                    this.lastAddress = readAddress;
                    this.pos = (int) (i10 + skip(inputStream, 2L));
                } else if (this.lastAddress + readAddress2 < this.MBRSize) {
                    this.pos = (int) (i11 + skip(inputStream, (readByte * 2) + 2));
                    readByte2 = -1;
                }
                if (readByte2 == 0) {
                    for (int i12 = 0; i12 < this.localBuf.length && i12 < readByte; i12++) {
                        int readByte3 = readByte(inputStream);
                        this.pos += 2;
                        this.localBuf[i12] = (byte) readByte3;
                    }
                    this.pos = (int) (this.pos + skip(inputStream, 2L));
                    this.localPos = 0;
                    return readByte;
                }
            }
        }
    }

    private long skip(InputStream inputStream, long j10) {
        long skip = inputStream.skip(j10);
        return skip < j10 ? skip + inputStream.skip(j10 - skip) : skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        return this.available - this.bytesRead;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i10) {
        try {
            super.mark(((FilterInputStream) this).in.available());
        } catch (IOException unused) {
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        throw new UnsupportedOperationException("Please, use readPacket() method instead");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return readPacket(bArr);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        throw new UnsupportedOperationException("Please, use readPacket() method instead");
    }

    public int readPacket(byte[] bArr) {
        int i10 = 0;
        while (i10 < bArr.length) {
            int i11 = this.localPos;
            if (i11 < this.size) {
                byte[] bArr2 = this.localBuf;
                this.localPos = i11 + 1;
                bArr[i10] = bArr2[i11];
                i10++;
            } else {
                int i12 = this.bytesRead;
                int readLine = readLine();
                this.size = readLine;
                this.bytesRead = i12 + readLine;
                if (readLine == 0) {
                    break;
                }
            }
        }
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        super.reset();
        this.pos = 0;
        this.bytesRead = 0;
        this.localPos = 128;
    }

    public int sizeInBytes() {
        return this.available;
    }

    public int sizeInPackets(int i10) {
        int sizeInBytes = sizeInBytes();
        return (sizeInBytes / i10) + (sizeInBytes % i10 > 0 ? 1 : 0);
    }
}
