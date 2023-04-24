package no.nordicsemi.android.dfu.internal;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Map;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import no.nordicsemi.android.dfu.DfuBaseService;
import no.nordicsemi.android.dfu.internal.manifest.Manifest;
import no.nordicsemi.android.dfu.internal.manifest.ManifestFile;
import qa.h;

/* loaded from: classes2.dex */
public class ArchiveInputStream extends InputStream {
    private static final String APPLICATION_BIN = "application.bin";
    private static final String APPLICATION_HEX = "application.hex";
    private static final String APPLICATION_INIT = "application.dat";
    private static final String BOOTLOADER_BIN = "bootloader.bin";
    private static final String BOOTLOADER_HEX = "bootloader.hex";
    private static final String MANIFEST = "manifest.json";
    private static final String SOFTDEVICE_BIN = "softdevice.bin";
    private static final String SOFTDEVICE_HEX = "softdevice.hex";
    private static final String SYSTEM_INIT = "system.dat";
    private static final String TAG = "DfuArchiveInputStream";
    private byte[] applicationBytes;
    private byte[] applicationInitBytes;
    private int applicationSize;
    private byte[] bootloaderBytes;
    private int bootloaderSize;
    private int bytesRead;
    private int bytesReadFromCurrentSource;
    private int bytesReadFromMarkedSource;
    private final CRC32 crc32;
    private byte[] currentSource;
    private final Map<String, byte[]> entries;
    private Manifest manifest;
    private byte[] markedSource;
    private byte[] softDeviceAndBootloaderBytes;
    private byte[] softDeviceBytes;
    private int softDeviceSize;
    private byte[] systemInitBytes;
    private int type;
    private final ZipInputStream zipInputStream;

    /* JADX WARN: Removed duplicated region for block: B:188:0x01fd A[Catch: all -> 0x0262, TryCatch #0 {all -> 0x0262, blocks: (B:112:0x0025, B:114:0x002d, B:120:0x003b, B:122:0x005d, B:126:0x0083, B:129:0x008d, B:131:0x0091, B:133:0x0095, B:135:0x00b7, B:136:0x00be, B:137:0x00db, B:138:0x00dc, B:139:0x00e3, B:140:0x00e4, B:143:0x00ee, B:145:0x00f2, B:147:0x0114, B:148:0x011b, B:149:0x0138, B:150:0x0139, B:153:0x0143, B:155:0x0147, B:157:0x014b, B:159:0x014f, B:161:0x0171, B:203:0x024d, B:169:0x01ad, B:170:0x01b4, B:162:0x0182, B:163:0x019f, B:164:0x01a0, B:165:0x01a7, B:123:0x0064, B:124:0x0081, B:172:0x01b7, B:193:0x021d, B:206:0x025a, B:207:0x0261, B:195:0x0220, B:197:0x022c, B:198:0x0236, B:200:0x023a, B:186:0x01f1, B:188:0x01fd, B:189:0x0207, B:191:0x020b, B:174:0x01bb, B:176:0x01c7, B:177:0x01d1, B:179:0x01d5), top: B:213:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x020b A[Catch: all -> 0x0262, TryCatch #0 {all -> 0x0262, blocks: (B:112:0x0025, B:114:0x002d, B:120:0x003b, B:122:0x005d, B:126:0x0083, B:129:0x008d, B:131:0x0091, B:133:0x0095, B:135:0x00b7, B:136:0x00be, B:137:0x00db, B:138:0x00dc, B:139:0x00e3, B:140:0x00e4, B:143:0x00ee, B:145:0x00f2, B:147:0x0114, B:148:0x011b, B:149:0x0138, B:150:0x0139, B:153:0x0143, B:155:0x0147, B:157:0x014b, B:159:0x014f, B:161:0x0171, B:203:0x024d, B:169:0x01ad, B:170:0x01b4, B:162:0x0182, B:163:0x019f, B:164:0x01a0, B:165:0x01a7, B:123:0x0064, B:124:0x0081, B:172:0x01b7, B:193:0x021d, B:206:0x025a, B:207:0x0261, B:195:0x0220, B:197:0x022c, B:198:0x0236, B:200:0x023a, B:186:0x01f1, B:188:0x01fd, B:189:0x0207, B:191:0x020b, B:174:0x01bb, B:176:0x01c7, B:177:0x01d1, B:179:0x01d5), top: B:213:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x022c A[Catch: all -> 0x0262, TryCatch #0 {all -> 0x0262, blocks: (B:112:0x0025, B:114:0x002d, B:120:0x003b, B:122:0x005d, B:126:0x0083, B:129:0x008d, B:131:0x0091, B:133:0x0095, B:135:0x00b7, B:136:0x00be, B:137:0x00db, B:138:0x00dc, B:139:0x00e3, B:140:0x00e4, B:143:0x00ee, B:145:0x00f2, B:147:0x0114, B:148:0x011b, B:149:0x0138, B:150:0x0139, B:153:0x0143, B:155:0x0147, B:157:0x014b, B:159:0x014f, B:161:0x0171, B:203:0x024d, B:169:0x01ad, B:170:0x01b4, B:162:0x0182, B:163:0x019f, B:164:0x01a0, B:165:0x01a7, B:123:0x0064, B:124:0x0081, B:172:0x01b7, B:193:0x021d, B:206:0x025a, B:207:0x0261, B:195:0x0220, B:197:0x022c, B:198:0x0236, B:200:0x023a, B:186:0x01f1, B:188:0x01fd, B:189:0x0207, B:191:0x020b, B:174:0x01bb, B:176:0x01c7, B:177:0x01d1, B:179:0x01d5), top: B:213:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x023a A[Catch: all -> 0x0262, TryCatch #0 {all -> 0x0262, blocks: (B:112:0x0025, B:114:0x002d, B:120:0x003b, B:122:0x005d, B:126:0x0083, B:129:0x008d, B:131:0x0091, B:133:0x0095, B:135:0x00b7, B:136:0x00be, B:137:0x00db, B:138:0x00dc, B:139:0x00e3, B:140:0x00e4, B:143:0x00ee, B:145:0x00f2, B:147:0x0114, B:148:0x011b, B:149:0x0138, B:150:0x0139, B:153:0x0143, B:155:0x0147, B:157:0x014b, B:159:0x014f, B:161:0x0171, B:203:0x024d, B:169:0x01ad, B:170:0x01b4, B:162:0x0182, B:163:0x019f, B:164:0x01a0, B:165:0x01a7, B:123:0x0064, B:124:0x0081, B:172:0x01b7, B:193:0x021d, B:206:0x025a, B:207:0x0261, B:195:0x0220, B:197:0x022c, B:198:0x0236, B:200:0x023a, B:186:0x01f1, B:188:0x01fd, B:189:0x0207, B:191:0x020b, B:174:0x01bb, B:176:0x01c7, B:177:0x01d1, B:179:0x01d5), top: B:213:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x025a A[Catch: all -> 0x0262, TRY_ENTER, TryCatch #0 {all -> 0x0262, blocks: (B:112:0x0025, B:114:0x002d, B:120:0x003b, B:122:0x005d, B:126:0x0083, B:129:0x008d, B:131:0x0091, B:133:0x0095, B:135:0x00b7, B:136:0x00be, B:137:0x00db, B:138:0x00dc, B:139:0x00e3, B:140:0x00e4, B:143:0x00ee, B:145:0x00f2, B:147:0x0114, B:148:0x011b, B:149:0x0138, B:150:0x0139, B:153:0x0143, B:155:0x0147, B:157:0x014b, B:159:0x014f, B:161:0x0171, B:203:0x024d, B:169:0x01ad, B:170:0x01b4, B:162:0x0182, B:163:0x019f, B:164:0x01a0, B:165:0x01a7, B:123:0x0064, B:124:0x0081, B:172:0x01b7, B:193:0x021d, B:206:0x025a, B:207:0x0261, B:195:0x0220, B:197:0x022c, B:198:0x0236, B:200:0x023a, B:186:0x01f1, B:188:0x01fd, B:189:0x0207, B:191:0x020b, B:174:0x01bb, B:176:0x01c7, B:177:0x01d1, B:179:0x01d5), top: B:213:0x0025 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ArchiveInputStream(java.io.InputStream r6, int r7, int r8) {
        /*
            Method dump skipped, instructions count: 651
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: no.nordicsemi.android.dfu.internal.ArchiveInputStream.<init>(java.io.InputStream, int, int):void");
    }

    private void parseZip(int i10) {
        String str;
        byte[] bArr = new byte[DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED];
        String str2 = null;
        while (true) {
            ZipEntry nextEntry = this.zipInputStream.getNextEntry();
            if (nextEntry == null) {
                break;
            }
            String validateFilename = validateFilename(nextEntry.getName(), ".");
            if (nextEntry.isDirectory()) {
                Log.w(TAG, "A directory found in the ZIP: " + validateFilename + "!");
            } else {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                while (true) {
                    int read = this.zipInputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                if (validateFilename.toLowerCase(Locale.US).endsWith("hex")) {
                    HexInputStream hexInputStream = new HexInputStream(byteArray, i10);
                    byteArray = new byte[hexInputStream.available()];
                    hexInputStream.read(byteArray);
                    hexInputStream.close();
                }
                if (MANIFEST.equals(validateFilename)) {
                    str2 = new String(byteArray, StandardCharsets.UTF_8);
                } else {
                    this.entries.put(validateFilename, byteArray);
                }
            }
        }
        if (this.entries.isEmpty()) {
            throw new FileNotFoundException("No files found in the ZIP. Check if the URI provided is valid and the ZIP contains required files on root level, not in a directory.");
        }
        if (str2 != null) {
            Manifest manifest = ((ManifestFile) new h().b(str2, ManifestFile.class)).getManifest();
            this.manifest = manifest;
            if (manifest != null) {
                return;
            }
            str = "Manifest failed to be parsed. Did you add \n-keep class no.nordicsemi.android.dfu.** { *; }\nto your proguard rules?";
        } else {
            str = "Manifest not found in the ZIP. It is recommended to use a distribution file created with: https://github.com/NordicSemiconductor/pc-nrfutil/ (for Legacy DFU use version 0.5.x)";
        }
        Log.w(TAG, str);
    }

    private int rawRead(byte[] bArr, int i10, int i11) {
        int min = Math.min(i11, this.currentSource.length - this.bytesReadFromCurrentSource);
        System.arraycopy(this.currentSource, this.bytesReadFromCurrentSource, bArr, i10, min);
        this.bytesReadFromCurrentSource += min;
        this.bytesRead += min;
        this.crc32.update(bArr, i10, min);
        return min;
    }

    private byte[] startNextFile() {
        byte[] bArr;
        byte[] bArr2 = this.currentSource;
        if (bArr2 != this.softDeviceBytes || (bArr = this.bootloaderBytes) == null || (this.type & 2) <= 0) {
            bArr = this.applicationBytes;
            if (bArr2 == bArr || bArr == null || (this.type & 4) <= 0) {
                bArr = null;
                this.currentSource = null;
            } else {
                this.currentSource = bArr;
            }
        } else {
            this.currentSource = bArr;
        }
        this.bytesReadFromCurrentSource = 0;
        return bArr;
    }

    private String validateFilename(String str, String str2) {
        String canonicalPath = new File(str).getCanonicalPath();
        if (canonicalPath.startsWith(new File(str2).getCanonicalPath())) {
            return canonicalPath.substring(1);
        }
        throw new IllegalStateException("File is outside extraction target directory.");
    }

    public int applicationImageSize() {
        if ((this.type & 4) > 0) {
            return this.applicationSize;
        }
        return 0;
    }

    @Override // java.io.InputStream
    public int available() {
        byte[] bArr = this.softDeviceAndBootloaderBytes;
        if (bArr != null && this.softDeviceSize == 0 && this.bootloaderSize == 0 && (this.type & 3) > 0) {
            return (applicationImageSize() + bArr.length) - this.bytesRead;
        }
        return (applicationImageSize() + (bootloaderImageSize() + softDeviceImageSize())) - this.bytesRead;
    }

    public int bootloaderImageSize() {
        if ((this.type & 2) > 0) {
            return this.bootloaderSize;
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.softDeviceBytes = null;
        this.bootloaderBytes = null;
        this.applicationBytes = null;
        this.softDeviceAndBootloaderBytes = null;
        this.applicationSize = 0;
        this.bootloaderSize = 0;
        this.softDeviceSize = 0;
        this.currentSource = null;
        this.bytesReadFromCurrentSource = 0;
        this.bytesRead = 0;
        this.zipInputStream.close();
    }

    public void fullReset() {
        byte[] bArr;
        byte[] bArr2 = this.softDeviceBytes;
        if (bArr2 != null && (bArr = this.bootloaderBytes) != null && this.currentSource == bArr) {
            this.currentSource = bArr2;
        }
        this.bytesReadFromCurrentSource = 0;
        mark(0);
        reset();
    }

    public byte[] getApplicationInit() {
        return this.applicationInitBytes;
    }

    public int getBytesRead() {
        return this.bytesRead;
    }

    public int getContentType() {
        this.type = 0;
        if (this.softDeviceAndBootloaderBytes != null) {
            this.type = 0 | 3;
        }
        if (this.softDeviceSize > 0) {
            this.type |= 1;
        }
        if (this.bootloaderSize > 0) {
            this.type |= 2;
        }
        if (this.applicationSize > 0) {
            this.type |= 4;
        }
        return this.type;
    }

    public long getCrc32() {
        return this.crc32.getValue();
    }

    public byte[] getSystemInit() {
        return this.systemInitBytes;
    }

    public boolean isSecureDfuRequired() {
        Manifest manifest = this.manifest;
        return manifest != null && manifest.isSecureDfuRequired();
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        this.markedSource = this.currentSource;
        this.bytesReadFromMarkedSource = this.bytesReadFromCurrentSource;
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read() {
        byte[] bArr = new byte[1];
        if (read(bArr) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        int rawRead = rawRead(bArr, i10, i11);
        return (i11 <= rawRead || startNextFile() == null) ? rawRead : rawRead + rawRead(bArr, i10 + rawRead, i11 - rawRead);
    }

    @Override // java.io.InputStream
    public void reset() {
        byte[] bArr;
        this.currentSource = this.markedSource;
        int i10 = this.bytesReadFromMarkedSource;
        this.bytesReadFromCurrentSource = i10;
        this.bytesRead = i10;
        this.crc32.reset();
        if (this.currentSource == this.bootloaderBytes && (bArr = this.softDeviceBytes) != null) {
            this.crc32.update(bArr);
            this.bytesRead += this.softDeviceSize;
        }
        this.crc32.update(this.currentSource, 0, this.bytesReadFromCurrentSource);
    }

    public int setContentType(int i10) {
        int i11;
        byte[] bArr;
        this.type = i10;
        int i12 = i10 & 4;
        if (i12 > 0 && this.applicationBytes == null) {
            this.type = i10 & (-5);
        }
        int i13 = i10 & 3;
        if (i13 == 3) {
            if (this.softDeviceBytes == null && this.softDeviceAndBootloaderBytes == null) {
                this.type &= -2;
            }
            if (this.bootloaderBytes == null && this.softDeviceAndBootloaderBytes == null) {
                i11 = this.type & (-2);
                this.type = i11;
            }
        } else if (this.softDeviceAndBootloaderBytes != null) {
            i11 = this.type & (-4);
            this.type = i11;
        }
        if (i13 > 0 && (bArr = this.softDeviceAndBootloaderBytes) != null) {
            this.currentSource = bArr;
        } else if ((i10 & 1) > 0) {
            this.currentSource = this.softDeviceBytes;
        } else if ((i10 & 2) > 0) {
            this.currentSource = this.bootloaderBytes;
        } else if (i12 > 0) {
            this.currentSource = this.applicationBytes;
        }
        this.bytesReadFromCurrentSource = 0;
        mark(0);
        reset();
        return this.type;
    }

    @Override // java.io.InputStream
    public long skip(long j10) {
        return 0L;
    }

    public int softDeviceImageSize() {
        if ((this.type & 1) > 0) {
            return this.softDeviceSize;
        }
        return 0;
    }
}
