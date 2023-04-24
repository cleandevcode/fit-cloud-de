package z1;

import a0.q;
import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import androidx.activity.i;
import androidx.appcompat.widget.e2;
import androidx.appcompat.widget.u0;
import com.huawei.hms.hmsscankit.RemoteView;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import no.nordicsemi.android.dfu.DfuBaseService;
import z1.b;

/* loaded from: classes.dex */
public final class a {
    public static final e U;
    public static final e[][] V;
    public static final e[] W;
    public static final HashMap<Integer, e>[] X;
    public static final HashMap<String, e>[] Y;
    public static final HashSet<String> Z;

    /* renamed from: a0 */
    public static final HashMap<Integer, Integer> f31880a0;

    /* renamed from: b0 */
    public static final Charset f31881b0;

    /* renamed from: c0 */
    public static final byte[] f31882c0;

    /* renamed from: d0 */
    public static final byte[] f31883d0;

    /* renamed from: e0 */
    public static final Pattern f31884e0;

    /* renamed from: f0 */
    public static final Pattern f31885f0;

    /* renamed from: g0 */
    public static final Pattern f31886g0;

    /* renamed from: a */
    public String f31894a;

    /* renamed from: b */
    public FileDescriptor f31895b;

    /* renamed from: c */
    public AssetManager.AssetInputStream f31896c;

    /* renamed from: d */
    public int f31897d;

    /* renamed from: e */
    public final HashMap<String, d>[] f31898e;

    /* renamed from: f */
    public HashSet f31899f;

    /* renamed from: g */
    public ByteOrder f31900g;

    /* renamed from: h */
    public boolean f31901h;

    /* renamed from: i */
    public boolean f31902i;

    /* renamed from: j */
    public boolean f31903j;

    /* renamed from: k */
    public int f31904k;

    /* renamed from: l */
    public int f31905l;

    /* renamed from: m */
    public byte[] f31906m;

    /* renamed from: n */
    public int f31907n;

    /* renamed from: o */
    public int f31908o;

    /* renamed from: p */
    public int f31909p;

    /* renamed from: q */
    public int f31910q;

    /* renamed from: r */
    public int f31911r;

    /* renamed from: s */
    public boolean f31912s;

    /* renamed from: t */
    public static final boolean f31887t = Log.isLoggable("ExifInterface", 3);

    /* renamed from: u */
    public static final List<Integer> f31888u = Arrays.asList(1, 6, 3, 8);

    /* renamed from: v */
    public static final List<Integer> f31889v = Arrays.asList(2, 7, 4, 5);

    /* renamed from: w */
    public static final int[] f31890w = {8, 8, 8};

    /* renamed from: x */
    public static final int[] f31891x = {8};

    /* renamed from: y */
    public static final byte[] f31892y = {-1, -40, -1};

    /* renamed from: z */
    public static final byte[] f31893z = {102, 116, 121, 112};
    public static final byte[] A = {109, 105, 102, 49};
    public static final byte[] B = {104, 101, 105, 99};
    public static final byte[] C = {79, 76, 89, 77, 80, 0};
    public static final byte[] D = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    public static final byte[] E = {-119, 80, 78, 71, 13, 10, 26, 10};
    public static final byte[] F = {101, 88, 73, 102};
    public static final byte[] G = {73, 72, 68, 82};
    public static final byte[] H = {73, 69, 78, 68};
    public static final byte[] I = {82, 73, 70, 70};
    public static final byte[] J = {87, 69, 66, 80};
    public static final byte[] K = {69, 88, 73, 70};
    public static final byte[] L = {-99, 1, 42};
    public static final byte[] M = "VP8X".getBytes(Charset.defaultCharset());
    public static final byte[] N = "VP8L".getBytes(Charset.defaultCharset());
    public static final byte[] O = "VP8 ".getBytes(Charset.defaultCharset());
    public static final byte[] P = "ANIM".getBytes(Charset.defaultCharset());
    public static final byte[] Q = "ANMF".getBytes(Charset.defaultCharset());
    public static final String[] R = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    public static final int[] S = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public static final byte[] T = {65, 83, 67, 73, 73, 0, 0, 0};

    /* renamed from: z1.a$a */
    /* loaded from: classes.dex */
    public class C0605a extends MediaDataSource {

        /* renamed from: a */
        public long f31913a;

        /* renamed from: b */
        public final /* synthetic */ g f31914b;

        public C0605a(g gVar) {
            this.f31914b = gVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        public final long getSize() {
            return -1L;
        }

        public final int readAt(long j10, byte[] bArr, int i10, int i11) {
            if (i11 == 0) {
                return 0;
            }
            if (j10 < 0) {
                return -1;
            }
            try {
                long j11 = this.f31913a;
                if (j11 != j10) {
                    if (j11 >= 0 && j10 >= j11 + this.f31914b.available()) {
                        return -1;
                    }
                    this.f31914b.b(j10);
                    this.f31913a = j10;
                }
                if (i11 > this.f31914b.available()) {
                    i11 = this.f31914b.available();
                }
                int read = this.f31914b.read(bArr, i10, i11);
                if (read >= 0) {
                    this.f31913a += read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.f31913a = -1L;
            return -1;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends InputStream implements DataInput {

        /* renamed from: e */
        public static final ByteOrder f31915e = ByteOrder.LITTLE_ENDIAN;

        /* renamed from: f */
        public static final ByteOrder f31916f = ByteOrder.BIG_ENDIAN;

        /* renamed from: a */
        public final DataInputStream f31917a;

        /* renamed from: b */
        public ByteOrder f31918b;

        /* renamed from: c */
        public int f31919c;

        /* renamed from: d */
        public byte[] f31920d;

        public b(InputStream inputStream) {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        public b(InputStream inputStream, ByteOrder byteOrder) {
            this.f31918b = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f31917a = dataInputStream;
            dataInputStream.mark(0);
            this.f31919c = 0;
            this.f31918b = byteOrder;
        }

        public b(byte[] bArr) {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        }

        public final void a(int i10) {
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i10 - i11;
                int skip = (int) this.f31917a.skip(i12);
                if (skip <= 0) {
                    if (this.f31920d == null) {
                        this.f31920d = new byte[DfuBaseService.ERROR_REMOTE_MASK];
                    }
                    skip = this.f31917a.read(this.f31920d, 0, Math.min((int) DfuBaseService.ERROR_REMOTE_MASK, i12));
                    if (skip == -1) {
                        throw new EOFException(i.a("Reached EOF while skipping ", i10, " bytes."));
                    }
                }
                i11 += skip;
            }
            this.f31919c += i11;
        }

        @Override // java.io.InputStream
        public final int available() {
            return this.f31917a.available();
        }

        @Override // java.io.InputStream
        public final void mark(int i10) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        @Override // java.io.InputStream
        public final int read() {
            this.f31919c++;
            return this.f31917a.read();
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i10, int i11) {
            int read = this.f31917a.read(bArr, i10, i11);
            this.f31919c += read;
            return read;
        }

        @Override // java.io.DataInput
        public final boolean readBoolean() {
            this.f31919c++;
            return this.f31917a.readBoolean();
        }

        @Override // java.io.DataInput
        public final byte readByte() {
            this.f31919c++;
            int read = this.f31917a.read();
            if (read >= 0) {
                return (byte) read;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public final char readChar() {
            this.f31919c += 2;
            return this.f31917a.readChar();
        }

        @Override // java.io.DataInput
        public final double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public final float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public final void readFully(byte[] bArr) {
            this.f31919c += bArr.length;
            this.f31917a.readFully(bArr);
        }

        @Override // java.io.DataInput
        public final void readFully(byte[] bArr, int i10, int i11) {
            this.f31919c += i11;
            this.f31917a.readFully(bArr, i10, i11);
        }

        @Override // java.io.DataInput
        public final int readInt() {
            this.f31919c += 4;
            int read = this.f31917a.read();
            int read2 = this.f31917a.read();
            int read3 = this.f31917a.read();
            int read4 = this.f31917a.read();
            if ((read | read2 | read3 | read4) >= 0) {
                ByteOrder byteOrder = this.f31918b;
                if (byteOrder == f31915e) {
                    return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                }
                if (byteOrder == f31916f) {
                    return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                }
                StringBuilder a10 = android.support.v4.media.d.a("Invalid byte order: ");
                a10.append(this.f31918b);
                throw new IOException(a10.toString());
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public final String readLine() {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public final long readLong() {
            this.f31919c += 8;
            int read = this.f31917a.read();
            int read2 = this.f31917a.read();
            int read3 = this.f31917a.read();
            int read4 = this.f31917a.read();
            int read5 = this.f31917a.read();
            int read6 = this.f31917a.read();
            int read7 = this.f31917a.read();
            int read8 = this.f31917a.read();
            if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                ByteOrder byteOrder = this.f31918b;
                if (byteOrder == f31915e) {
                    return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                }
                if (byteOrder == f31916f) {
                    return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
                }
                StringBuilder a10 = android.support.v4.media.d.a("Invalid byte order: ");
                a10.append(this.f31918b);
                throw new IOException(a10.toString());
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public final short readShort() {
            this.f31919c += 2;
            int read = this.f31917a.read();
            int read2 = this.f31917a.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.f31918b;
                if (byteOrder == f31915e) {
                    return (short) ((read2 << 8) + read);
                }
                if (byteOrder == f31916f) {
                    return (short) ((read << 8) + read2);
                }
                StringBuilder a10 = android.support.v4.media.d.a("Invalid byte order: ");
                a10.append(this.f31918b);
                throw new IOException(a10.toString());
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public final String readUTF() {
            this.f31919c += 2;
            return this.f31917a.readUTF();
        }

        @Override // java.io.DataInput
        public final int readUnsignedByte() {
            this.f31919c++;
            return this.f31917a.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public final int readUnsignedShort() {
            this.f31919c += 2;
            int read = this.f31917a.read();
            int read2 = this.f31917a.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.f31918b;
                if (byteOrder == f31915e) {
                    return (read2 << 8) + read;
                }
                if (byteOrder == f31916f) {
                    return (read << 8) + read2;
                }
                StringBuilder a10 = android.support.v4.media.d.a("Invalid byte order: ");
                a10.append(this.f31918b);
                throw new IOException(a10.toString());
            }
            throw new EOFException();
        }

        @Override // java.io.InputStream
        public final void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override // java.io.DataInput
        public final int skipBytes(int i10) {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }
    }

    /* loaded from: classes.dex */
    public static class c extends FilterOutputStream {

        /* renamed from: a */
        public final OutputStream f31921a;

        /* renamed from: b */
        public ByteOrder f31922b;

        public c(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.f31921a = outputStream;
            this.f31922b = byteOrder;
        }

        public final void a(int i10) {
            this.f31921a.write(i10);
        }

        public final void b(int i10) {
            OutputStream outputStream;
            int i11;
            ByteOrder byteOrder = this.f31922b;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f31921a.write((i10 >>> 0) & 255);
                this.f31921a.write((i10 >>> 8) & 255);
                this.f31921a.write((i10 >>> 16) & 255);
                outputStream = this.f31921a;
                i11 = i10 >>> 24;
            } else if (byteOrder != ByteOrder.BIG_ENDIAN) {
                return;
            } else {
                this.f31921a.write((i10 >>> 24) & 255);
                this.f31921a.write((i10 >>> 16) & 255);
                this.f31921a.write((i10 >>> 8) & 255);
                outputStream = this.f31921a;
                i11 = i10 >>> 0;
            }
            outputStream.write(i11 & 255);
        }

        public final void h(short s10) {
            OutputStream outputStream;
            int i10;
            ByteOrder byteOrder = this.f31922b;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f31921a.write((s10 >>> 0) & 255);
                outputStream = this.f31921a;
                i10 = s10 >>> 8;
            } else if (byteOrder != ByteOrder.BIG_ENDIAN) {
                return;
            } else {
                this.f31921a.write((s10 >>> 8) & 255);
                outputStream = this.f31921a;
                i10 = s10 >>> 0;
            }
            outputStream.write(i10 & 255);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public final void write(byte[] bArr) {
            this.f31921a.write(bArr);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public final void write(byte[] bArr, int i10, int i11) {
            this.f31921a.write(bArr, i10, i11);
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        public final int f31923a;

        /* renamed from: b */
        public final int f31924b;

        /* renamed from: c */
        public final long f31925c;

        /* renamed from: d */
        public final byte[] f31926d;

        public d(long j10, byte[] bArr, int i10, int i11) {
            this.f31923a = i10;
            this.f31924b = i11;
            this.f31925c = j10;
            this.f31926d = bArr;
        }

        public d(byte[] bArr, int i10, int i11) {
            this(-1L, bArr, i10, i11);
        }

        public static d a(String str) {
            byte[] bytes = (str + (char) 0).getBytes(a.f31881b0);
            return new d(bytes, 2, bytes.length);
        }

        public static d b(long j10, ByteOrder byteOrder) {
            return c(new long[]{j10}, byteOrder);
        }

        public static d c(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.S[4] * jArr.length]);
            wrap.order(byteOrder);
            for (long j10 : jArr) {
                wrap.putInt((int) j10);
            }
            return new d(wrap.array(), 4, jArr.length);
        }

        public static d d(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.S[5] * fVarArr.length]);
            wrap.order(byteOrder);
            for (f fVar : fVarArr) {
                wrap.putInt((int) fVar.f31931a);
                wrap.putInt((int) fVar.f31932b);
            }
            return new d(wrap.array(), 5, fVarArr.length);
        }

        public static d e(int i10, ByteOrder byteOrder) {
            return f(new int[]{i10}, byteOrder);
        }

        public static d f(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.S[3] * iArr.length]);
            wrap.order(byteOrder);
            for (int i10 : iArr) {
                wrap.putShort((short) i10);
            }
            return new d(wrap.array(), 3, iArr.length);
        }

        public final double g(ByteOrder byteOrder) {
            Serializable j10 = j(byteOrder);
            if (j10 != null) {
                if (j10 instanceof String) {
                    return Double.parseDouble((String) j10);
                }
                if (j10 instanceof long[]) {
                    long[] jArr = (long[]) j10;
                    if (jArr.length == 1) {
                        return jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (j10 instanceof int[]) {
                    int[] iArr = (int[]) j10;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (j10 instanceof double[]) {
                    double[] dArr = (double[]) j10;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (j10 instanceof f[]) {
                    f[] fVarArr = (f[]) j10;
                    if (fVarArr.length == 1) {
                        f fVar = fVarArr[0];
                        return fVar.f31931a / fVar.f31932b;
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
            }
            throw new NumberFormatException("NULL can't be converted to a double value");
        }

        public final int h(ByteOrder byteOrder) {
            Serializable j10 = j(byteOrder);
            if (j10 != null) {
                if (j10 instanceof String) {
                    return Integer.parseInt((String) j10);
                }
                if (j10 instanceof long[]) {
                    long[] jArr = (long[]) j10;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (j10 instanceof int[]) {
                    int[] iArr = (int[]) j10;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a integer value");
                }
            }
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }

        public final String i(ByteOrder byteOrder) {
            Serializable j10 = j(byteOrder);
            if (j10 == null) {
                return null;
            }
            if (j10 instanceof String) {
                return (String) j10;
            }
            StringBuilder sb2 = new StringBuilder();
            int i10 = 0;
            if (j10 instanceof long[]) {
                long[] jArr = (long[]) j10;
                while (i10 < jArr.length) {
                    sb2.append(jArr[i10]);
                    i10++;
                    if (i10 != jArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (j10 instanceof int[]) {
                int[] iArr = (int[]) j10;
                while (i10 < iArr.length) {
                    sb2.append(iArr[i10]);
                    i10++;
                    if (i10 != iArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (j10 instanceof double[]) {
                double[] dArr = (double[]) j10;
                while (i10 < dArr.length) {
                    sb2.append(dArr[i10]);
                    i10++;
                    if (i10 != dArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (j10 instanceof f[]) {
                f[] fVarArr = (f[]) j10;
                while (i10 < fVarArr.length) {
                    sb2.append(fVarArr[i10].f31931a);
                    sb2.append('/');
                    sb2.append(fVarArr[i10].f31932b);
                    i10++;
                    if (i10 != fVarArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else {
                return null;
            }
        }

        /* JADX WARN: Not initialized variable reg: 3, insn: 0x01a3: MOVE  (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:346:0x01a3 */
        /* JADX WARN: Removed duplicated region for block: B:372:0x01a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r13v19, types: [int[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r13v21, types: [long[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r13v23, types: [z1.a$f[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r13v25, types: [int[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r13v27, types: [int[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r13v29, types: [z1.a$f[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r13v31, types: [double[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r13v33, types: [double[], java.io.Serializable] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.io.Serializable j(java.nio.ByteOrder r13) {
            /*
                Method dump skipped, instructions count: 460
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: z1.a.d.j(java.nio.ByteOrder):java.io.Serializable");
        }

        public final String toString() {
            StringBuilder a10 = android.support.v4.media.d.a("(");
            a10.append(a.R[this.f31923a]);
            a10.append(", data length:");
            return q.b(a10, this.f31926d.length, ")");
        }
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a */
        public final int f31927a;

        /* renamed from: b */
        public final String f31928b;

        /* renamed from: c */
        public final int f31929c;

        /* renamed from: d */
        public final int f31930d;

        public e(int i10, String str, int i11, int i12) {
            this.f31928b = str;
            this.f31927a = i10;
            this.f31929c = i11;
            this.f31930d = i12;
        }

        public e(String str, int i10, int i11) {
            this.f31928b = str;
            this.f31927a = i10;
            this.f31929c = i11;
            this.f31930d = -1;
        }
    }

    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a */
        public final long f31931a;

        /* renamed from: b */
        public final long f31932b;

        public f(double d10) {
            this((long) (d10 * 10000.0d), 10000L);
        }

        public f(long j10, long j11) {
            if (j11 == 0) {
                this.f31931a = 0L;
                this.f31932b = 1L;
                return;
            }
            this.f31931a = j10;
            this.f31932b = j11;
        }

        public final String toString() {
            return this.f31931a + "/" + this.f31932b;
        }
    }

    /* loaded from: classes.dex */
    public static class g extends b {
        public g(InputStream inputStream) {
            super(inputStream);
            if (!inputStream.markSupported()) {
                throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
            }
            this.f31917a.mark(Integer.MAX_VALUE);
        }

        public g(byte[] bArr) {
            super(bArr);
            this.f31917a.mark(Integer.MAX_VALUE);
        }

        public final void b(long j10) {
            int i10 = this.f31919c;
            if (i10 > j10) {
                this.f31919c = 0;
                this.f31917a.reset();
            } else {
                j10 -= i10;
            }
            a((int) j10);
        }
    }

    static {
        e[] eVarArr;
        e[] eVarArr2 = {new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e(DfuBaseService.ERROR_REMOTE_TYPE_LEGACY, "ImageWidth", 3, 4), new e(257, "ImageLength", 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e(273, "StripOffsets", 3, 4), new e("Orientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e(278, "RowsPerStrip", 3, 4), new e(279, "StripByteCounts", 3, 4), new e("XResolution", 282, 5), new e("YResolution", DfuBaseService.NOTIFICATION_ID, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("SensorTopBorder", 4, 4), new e("SensorLeftBorder", 5, 4), new e("SensorBottomBorder", 6, 4), new e("SensorRightBorder", 7, 4), new e("ISO", 23, 3), new e("JpgFromRaw", 46, 7), new e("Xmp", 700, 1)};
        e[] eVarArr3 = {new e("ExposureTime", 33434, 5), new e("FNumber", 33437, 5), new e("ExposureProgram", 34850, 3), new e("SpectralSensitivity", 34852, 2), new e("PhotographicSensitivity", 34855, 3), new e("OECF", 34856, 7), new e("SensitivityType", 34864, 3), new e("StandardOutputSensitivity", 34865, 4), new e("RecommendedExposureIndex", 34866, 4), new e("ISOSpeed", 34867, 4), new e("ISOSpeedLatitudeyyy", 34868, 4), new e("ISOSpeedLatitudezzz", 34869, 4), new e("ExifVersion", 36864, 2), new e("DateTimeOriginal", 36867, 2), new e("DateTimeDigitized", 36868, 2), new e("OffsetTime", 36880, 2), new e("OffsetTimeOriginal", 36881, 2), new e("OffsetTimeDigitized", 36882, 2), new e("ComponentsConfiguration", 37121, 7), new e("CompressedBitsPerPixel", 37122, 5), new e("ShutterSpeedValue", 37377, 10), new e("ApertureValue", 37378, 5), new e("BrightnessValue", 37379, 10), new e("ExposureBiasValue", 37380, 10), new e("MaxApertureValue", 37381, 5), new e("SubjectDistance", 37382, 5), new e("MeteringMode", 37383, 3), new e("LightSource", 37384, 3), new e("Flash", 37385, 3), new e("FocalLength", 37386, 5), new e("SubjectArea", 37396, 3), new e("MakerNote", 37500, 7), new e("UserComment", 37510, 7), new e("SubSecTime", 37520, 2), new e("SubSecTimeOriginal", 37521, 2), new e("SubSecTimeDigitized", 37522, 2), new e("FlashpixVersion", 40960, 7), new e("ColorSpace", 40961, 3), new e(40962, "PixelXDimension", 3, 4), new e(40963, "PixelYDimension", 3, 4), new e("RelatedSoundFile", 40964, 2), new e("InteroperabilityIFDPointer", 40965, 4), new e("FlashEnergy", 41483, 5), new e("SpatialFrequencyResponse", 41484, 7), new e("FocalPlaneXResolution", 41486, 5), new e("FocalPlaneYResolution", 41487, 5), new e("FocalPlaneResolutionUnit", 41488, 3), new e("SubjectLocation", 41492, 3), new e("ExposureIndex", 41493, 5), new e("SensingMethod", 41495, 3), new e("FileSource", 41728, 7), new e("SceneType", 41729, 7), new e("CFAPattern", 41730, 7), new e("CustomRendered", 41985, 3), new e("ExposureMode", 41986, 3), new e("WhiteBalance", 41987, 3), new e("DigitalZoomRatio", 41988, 5), new e("FocalLengthIn35mmFilm", 41989, 3), new e("SceneCaptureType", 41990, 3), new e("GainControl", 41991, 3), new e("Contrast", 41992, 3), new e("Saturation", 41993, 3), new e("Sharpness", 41994, 3), new e("DeviceSettingDescription", 41995, 7), new e("SubjectDistanceRange", 41996, 3), new e("ImageUniqueID", 42016, 2), new e("CameraOwnerName", 42032, 2), new e("BodySerialNumber", 42033, 2), new e("LensSpecification", 42034, 5), new e("LensMake", 42035, 2), new e("LensModel", 42036, 2), new e("Gamma", 42240, 5), new e("DNGVersion", 50706, 1), new e(50720, "DefaultCropSize", 3, 4)};
        e[] eVarArr4 = {new e("GPSVersionID", 0, 1), new e("GPSLatitudeRef", 1, 2), new e(2, "GPSLatitude", 5, 10), new e("GPSLongitudeRef", 3, 2), new e(4, "GPSLongitude", 5, 10), new e("GPSAltitudeRef", 5, 1), new e("GPSAltitude", 6, 5), new e("GPSTimeStamp", 7, 5), new e("GPSSatellites", 8, 2), new e("GPSStatus", 9, 2), new e("GPSMeasureMode", 10, 2), new e("GPSDOP", 11, 5), new e("GPSSpeedRef", 12, 2), new e("GPSSpeed", 13, 5), new e("GPSTrackRef", 14, 2), new e("GPSTrack", 15, 5), new e("GPSImgDirectionRef", 16, 2), new e("GPSImgDirection", 17, 5), new e("GPSMapDatum", 18, 2), new e("GPSDestLatitudeRef", 19, 2), new e("GPSDestLatitude", 20, 5), new e("GPSDestLongitudeRef", 21, 2), new e("GPSDestLongitude", 22, 5), new e("GPSDestBearingRef", 23, 2), new e("GPSDestBearing", 24, 5), new e("GPSDestDistanceRef", 25, 2), new e("GPSDestDistance", 26, 5), new e("GPSProcessingMethod", 27, 7), new e("GPSAreaInformation", 28, 7), new e("GPSDateStamp", 29, 2), new e("GPSDifferential", 30, 3), new e("GPSHPositioningError", 31, 5)};
        e[] eVarArr5 = {new e("InteroperabilityIndex", 1, 2)};
        e[] eVarArr6 = {new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e(DfuBaseService.ERROR_REMOTE_TYPE_LEGACY, "ThumbnailImageWidth", 3, 4), new e(257, "ThumbnailImageLength", 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e(273, "StripOffsets", 3, 4), new e("ThumbnailOrientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e(278, "RowsPerStrip", 3, 4), new e(279, "StripByteCounts", 3, 4), new e("XResolution", 282, 5), new e("YResolution", DfuBaseService.NOTIFICATION_ID, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Xmp", 700, 1), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("DNGVersion", 50706, 1), new e(50720, "DefaultCropSize", 3, 4)};
        U = new e("StripOffsets", 273, 3);
        V = new e[][]{eVarArr2, eVarArr3, eVarArr4, eVarArr5, eVarArr6, eVarArr2, new e[]{new e("ThumbnailImage", DfuBaseService.ERROR_REMOTE_TYPE_LEGACY, 7), new e("CameraSettingsIFDPointer", 8224, 4), new e("ImageProcessingIFDPointer", 8256, 4)}, new e[]{new e("PreviewImageStart", 257, 4), new e("PreviewImageLength", 258, 4)}, new e[]{new e("AspectFrame", RemoteView.REQUEST_CODE_PHOTO, 3)}, new e[]{new e("ColorSpace", 55, 3)}};
        W = new e[]{new e("SubIFDPointer", 330, 4), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("InteroperabilityIFDPointer", 40965, 4), new e("CameraSettingsIFDPointer", 8224, 1), new e("ImageProcessingIFDPointer", 8256, 1)};
        X = new HashMap[10];
        Y = new HashMap[10];
        Z = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f31880a0 = new HashMap<>();
        Charset forName = Charset.forName("US-ASCII");
        f31881b0 = forName;
        f31882c0 = "Exif\u0000\u0000".getBytes(forName);
        f31883d0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i10 = 0;
        while (true) {
            e[][] eVarArr7 = V;
            if (i10 >= eVarArr7.length) {
                HashMap<Integer, Integer> hashMap = f31880a0;
                e[] eVarArr8 = W;
                hashMap.put(Integer.valueOf(eVarArr8[0].f31927a), 5);
                hashMap.put(Integer.valueOf(eVarArr8[1].f31927a), 1);
                hashMap.put(Integer.valueOf(eVarArr8[2].f31927a), 2);
                hashMap.put(Integer.valueOf(eVarArr8[3].f31927a), 3);
                hashMap.put(Integer.valueOf(eVarArr8[4].f31927a), 7);
                hashMap.put(Integer.valueOf(eVarArr8[5].f31927a), 8);
                Pattern.compile(".*[1-9].*");
                f31884e0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f31885f0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f31886g0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            X[i10] = new HashMap<>();
            Y[i10] = new HashMap<>();
            for (e eVar : eVarArr7[i10]) {
                X[i10].put(Integer.valueOf(eVar.f31927a), eVar);
                Y[i10].put(eVar.f31928b, eVar);
            }
            i10++;
        }
    }

    public a(InputStream inputStream) {
        boolean z10;
        e[][] eVarArr = V;
        this.f31898e = new HashMap[eVarArr.length];
        this.f31899f = new HashSet(eVarArr.length);
        this.f31900g = ByteOrder.BIG_ENDIAN;
        if (inputStream == null) {
            throw new NullPointerException("inputStream cannot be null");
        }
        FileDescriptor fileDescriptor = null;
        this.f31894a = null;
        if (inputStream instanceof AssetManager.AssetInputStream) {
            this.f31896c = (AssetManager.AssetInputStream) inputStream;
        } else {
            if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                try {
                    b.a.c(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                    z10 = true;
                } catch (Exception unused) {
                    if (f31887t) {
                        Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                    }
                    z10 = false;
                }
                if (z10) {
                    this.f31896c = null;
                    fileDescriptor = fileInputStream.getFD();
                }
            }
            this.f31896c = null;
        }
        this.f31895b = fileDescriptor;
        t(inputStream);
    }

    public static double b(String str, String str2) {
        try {
            String[] split = str.split(",", -1);
            String[] split2 = split[0].split("/", -1);
            double parseDouble = Double.parseDouble(split2[0].trim()) / Double.parseDouble(split2[1].trim());
            String[] split3 = split[1].split("/", -1);
            String[] split4 = split[2].split("/", -1);
            double parseDouble2 = ((Double.parseDouble(split4[0].trim()) / Double.parseDouble(split4[1].trim())) / 3600.0d) + ((Double.parseDouble(split3[0].trim()) / Double.parseDouble(split3[1].trim())) / 60.0d) + parseDouble;
            if (!str2.equals("S") && !str2.equals("W")) {
                if (!str2.equals("N") && !str2.equals("E")) {
                    throw new IllegalArgumentException();
                }
                return parseDouble2;
            }
            return -parseDouble2;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
            throw new IllegalArgumentException();
        }
    }

    public static void c(b bVar, c cVar, byte[] bArr, byte[] bArr2) {
        String sb2;
        while (true) {
            byte[] bArr3 = new byte[4];
            if (bVar.read(bArr3) != 4) {
                StringBuilder a10 = android.support.v4.media.d.a("Encountered invalid length while copying WebP chunks up tochunk type ");
                Charset charset = f31881b0;
                a10.append(new String(bArr, charset));
                if (bArr2 == null) {
                    sb2 = "";
                } else {
                    StringBuilder a11 = android.support.v4.media.d.a(" or ");
                    a11.append(new String(bArr2, charset));
                    sb2 = a11.toString();
                }
                a10.append(sb2);
                throw new IOException(a10.toString());
            }
            int readInt = bVar.readInt();
            cVar.write(bArr3);
            cVar.b(readInt);
            if (readInt % 2 == 1) {
                readInt++;
            }
            z1.b.e(bVar, cVar, readInt);
            if (!Arrays.equals(bArr3, bArr)) {
                if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public static Pair<Integer, Integer> q(String str) {
        if (str.contains(",")) {
            String[] split = str.split(",", -1);
            Pair<Integer, Integer> q10 = q(split[0]);
            if (((Integer) q10.first).intValue() == 2) {
                return q10;
            }
            for (int i10 = 1; i10 < split.length; i10++) {
                Pair<Integer, Integer> q11 = q(split[i10]);
                int intValue = (((Integer) q11.first).equals(q10.first) || ((Integer) q11.second).equals(q10.first)) ? ((Integer) q10.first).intValue() : -1;
                int intValue2 = (((Integer) q10.second).intValue() == -1 || !(((Integer) q11.first).equals(q10.second) || ((Integer) q11.second).equals(q10.second))) ? -1 : ((Integer) q10.second).intValue();
                if (intValue == -1 && intValue2 == -1) {
                    return new Pair<>(2, -1);
                }
                if (intValue == -1) {
                    q10 = new Pair<>(Integer.valueOf(intValue2), -1);
                } else if (intValue2 == -1) {
                    q10 = new Pair<>(Integer.valueOf(intValue), -1);
                }
            }
            return q10;
        } else if (!str.contains("/")) {
            try {
                try {
                    Long valueOf = Long.valueOf(Long.parseLong(str));
                    return (valueOf.longValue() < 0 || valueOf.longValue() > 65535) ? valueOf.longValue() < 0 ? new Pair<>(9, -1) : new Pair<>(4, -1) : new Pair<>(3, 4);
                } catch (NumberFormatException unused) {
                    Double.parseDouble(str);
                    return new Pair<>(12, -1);
                }
            } catch (NumberFormatException unused2) {
                return new Pair<>(2, -1);
            }
        } else {
            String[] split2 = str.split("/", -1);
            if (split2.length == 2) {
                try {
                    long parseDouble = (long) Double.parseDouble(split2[0]);
                    long parseDouble2 = (long) Double.parseDouble(split2[1]);
                    if (parseDouble >= 0 && parseDouble2 >= 0) {
                        if (parseDouble <= 2147483647L && parseDouble2 <= 2147483647L) {
                            return new Pair<>(10, 5);
                        }
                        return new Pair<>(5, -1);
                    }
                    return new Pair<>(10, -1);
                } catch (NumberFormatException unused3) {
                }
            }
            return new Pair<>(2, -1);
        }
    }

    public static ByteOrder w(b bVar) {
        short readShort = bVar.readShort();
        if (readShort != 18761) {
            if (readShort == 19789) {
                if (f31887t) {
                    Log.d("ExifInterface", "readExifSegment: Byte Align MM");
                }
                return ByteOrder.BIG_ENDIAN;
            }
            StringBuilder a10 = android.support.v4.media.d.a("Invalid byte order: ");
            a10.append(Integer.toHexString(readShort));
            throw new IOException(a10.toString());
        }
        if (f31887t) {
            Log.d("ExifInterface", "readExifSegment: Byte Align II");
        }
        return ByteOrder.LITTLE_ENDIAN;
    }

    public final void A(int i10, String str, String str2) {
        if (this.f31898e[i10].isEmpty() || this.f31898e[i10].get(str) == null) {
            return;
        }
        HashMap<String, d> hashMap = this.f31898e[i10];
        hashMap.put(str2, hashMap.get(str));
        this.f31898e[i10].remove(str);
    }

    public final void B(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) {
        if (f31887t) {
            Log.d("ExifInterface", "saveJpegAttributes starting with (inputStream: " + bufferedInputStream + ", outputStream: " + bufferedOutputStream + ")");
        }
        b bVar = new b(bufferedInputStream);
        c cVar = new c(bufferedOutputStream, ByteOrder.BIG_ENDIAN);
        if (bVar.readByte() == -1) {
            cVar.a(-1);
            if (bVar.readByte() == -40) {
                cVar.a(-40);
                d dVar = null;
                if (d("Xmp") != null && this.f31912s) {
                    dVar = this.f31898e[0].remove("Xmp");
                }
                cVar.a(-1);
                cVar.a(-31);
                J(cVar);
                if (dVar != null) {
                    this.f31898e[0].put("Xmp", dVar);
                }
                byte[] bArr = new byte[4096];
                while (bVar.readByte() == -1) {
                    byte readByte = bVar.readByte();
                    if (readByte != -39 && readByte != -38) {
                        if (readByte != -31) {
                            cVar.a(-1);
                            cVar.a(readByte);
                            int readUnsignedShort = bVar.readUnsignedShort();
                            cVar.h((short) readUnsignedShort);
                            int i10 = readUnsignedShort - 2;
                            if (i10 >= 0) {
                                while (i10 > 0) {
                                    int read = bVar.read(bArr, 0, Math.min(i10, 4096));
                                    if (read >= 0) {
                                        cVar.write(bArr, 0, read);
                                        i10 -= read;
                                    }
                                }
                            } else {
                                throw new IOException("Invalid length");
                            }
                        } else {
                            int readUnsignedShort2 = bVar.readUnsignedShort() - 2;
                            if (readUnsignedShort2 >= 0) {
                                byte[] bArr2 = new byte[6];
                                if (readUnsignedShort2 >= 6) {
                                    if (bVar.read(bArr2) == 6) {
                                        if (Arrays.equals(bArr2, f31882c0)) {
                                            bVar.a(readUnsignedShort2 - 6);
                                        }
                                    } else {
                                        throw new IOException("Invalid exif");
                                    }
                                }
                                cVar.a(-1);
                                cVar.a(readByte);
                                cVar.h((short) (readUnsignedShort2 + 2));
                                if (readUnsignedShort2 >= 6) {
                                    readUnsignedShort2 -= 6;
                                    cVar.write(bArr2);
                                }
                                while (readUnsignedShort2 > 0) {
                                    int read2 = bVar.read(bArr, 0, Math.min(readUnsignedShort2, 4096));
                                    if (read2 >= 0) {
                                        cVar.write(bArr, 0, read2);
                                        readUnsignedShort2 -= read2;
                                    }
                                }
                            } else {
                                throw new IOException("Invalid length");
                            }
                        }
                    } else {
                        cVar.a(-1);
                        cVar.a(readByte);
                        z1.b.d(bVar, cVar);
                        return;
                    }
                }
                throw new IOException("Invalid marker");
            }
            throw new IOException("Invalid marker");
        }
        throw new IOException("Invalid marker");
    }

    public final void C(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) {
        if (f31887t) {
            Log.d("ExifInterface", "savePngAttributes starting with (inputStream: " + bufferedInputStream + ", outputStream: " + bufferedOutputStream + ")");
        }
        b bVar = new b(bufferedInputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        c cVar = new c(bufferedOutputStream, byteOrder);
        byte[] bArr = E;
        z1.b.e(bVar, cVar, bArr.length);
        int i10 = this.f31908o;
        if (i10 == 0) {
            int readInt = bVar.readInt();
            cVar.b(readInt);
            z1.b.e(bVar, cVar, readInt + 4 + 4);
        } else {
            z1.b.e(bVar, cVar, ((i10 - bArr.length) - 4) - 4);
            bVar.a(bVar.readInt() + 4 + 4);
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                c cVar2 = new c(byteArrayOutputStream2, byteOrder);
                J(cVar2);
                byte[] byteArray = ((ByteArrayOutputStream) cVar2.f31921a).toByteArray();
                cVar.write(byteArray);
                CRC32 crc32 = new CRC32();
                crc32.update(byteArray, 4, byteArray.length - 4);
                cVar.b((int) crc32.getValue());
                z1.b.b(byteArrayOutputStream2);
                z1.b.d(bVar, cVar);
            } catch (Throwable th2) {
                th = th2;
                byteArrayOutputStream = byteArrayOutputStream2;
                z1.b.b(byteArrayOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x01ac A[Catch: all -> 0x006c, Exception -> 0x01eb, TryCatch #4 {Exception -> 0x01eb, all -> 0x006c, blocks: (B:98:0x004d, B:100:0x0056, B:159:0x01c8, B:160:0x01cb, B:103:0x006f, B:105:0x0077, B:107:0x0083, B:109:0x008b, B:111:0x008f, B:114:0x009f, B:116:0x00aa, B:117:0x00af, B:120:0x00be, B:122:0x00cc, B:123:0x00ce, B:124:0x00d2, B:125:0x00db, B:127:0x00e3, B:129:0x00eb, B:131:0x00f3, B:133:0x00f7, B:135:0x0102, B:137:0x010d, B:139:0x0115, B:151:0x015d, B:153:0x01ac, B:157:0x01c2, B:158:0x01c5, B:154:0x01b5, B:156:0x01bd, B:140:0x0124, B:141:0x012b, B:142:0x012c, B:144:0x0134, B:146:0x013a, B:147:0x014e, B:148:0x0155, B:163:0x01e3, B:164:0x01ea), top: B:178:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01b5 A[Catch: all -> 0x006c, Exception -> 0x01eb, TryCatch #4 {Exception -> 0x01eb, all -> 0x006c, blocks: (B:98:0x004d, B:100:0x0056, B:159:0x01c8, B:160:0x01cb, B:103:0x006f, B:105:0x0077, B:107:0x0083, B:109:0x008b, B:111:0x008f, B:114:0x009f, B:116:0x00aa, B:117:0x00af, B:120:0x00be, B:122:0x00cc, B:123:0x00ce, B:124:0x00d2, B:125:0x00db, B:127:0x00e3, B:129:0x00eb, B:131:0x00f3, B:133:0x00f7, B:135:0x0102, B:137:0x010d, B:139:0x0115, B:151:0x015d, B:153:0x01ac, B:157:0x01c2, B:158:0x01c5, B:154:0x01b5, B:156:0x01bd, B:140:0x0124, B:141:0x012b, B:142:0x012c, B:144:0x0134, B:146:0x013a, B:147:0x014e, B:148:0x0155, B:163:0x01e3, B:164:0x01ea), top: B:178:0x004d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D(java.io.BufferedInputStream r20, java.io.BufferedOutputStream r21) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.a.D(java.io.BufferedInputStream, java.io.BufferedOutputStream):void");
    }

    public final void E(String str, String str2) {
        StringBuilder sb2;
        e eVar;
        int i10;
        String str3;
        String str4;
        d dVar;
        String str5;
        HashMap<String, d> hashMap;
        d a10;
        String sb3;
        Matcher matcher;
        String str6 = str;
        String str7 = str2;
        String str8 = "ExifInterface";
        if (("DateTime".equals(str6) || "DateTimeOriginal".equals(str6) || "DateTimeDigitized".equals(str6)) && str7 != null) {
            boolean find = f31885f0.matcher(str7).find();
            boolean find2 = f31886g0.matcher(str7).find();
            if (str2.length() == 19 && (find || find2)) {
                if (find2) {
                    str7 = str7.replaceAll("-", ":");
                }
            } else {
                sb2 = new StringBuilder();
                sb2.append("Invalid value for ");
                sb2.append(str6);
                sb2.append(" : ");
                sb2.append(str7);
                Log.w("ExifInterface", sb2.toString());
                return;
            }
        }
        if ("ISOSpeedRatings".equals(str6)) {
            if (f31887t) {
                Log.d("ExifInterface", "setAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str6 = "PhotographicSensitivity";
        }
        int i11 = 2;
        int i12 = 1;
        if (str7 != null && Z.contains(str6)) {
            if (str6.equals("GPSTimeStamp")) {
                if (!f31884e0.matcher(str7).find()) {
                    sb2 = new StringBuilder();
                    sb2.append("Invalid value for ");
                    sb2.append(str6);
                    sb2.append(" : ");
                    sb2.append(str7);
                    Log.w("ExifInterface", sb2.toString());
                    return;
                }
                str7 = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
            } else {
                try {
                    str7 = new f(Double.parseDouble(str7)).toString();
                } catch (NumberFormatException unused) {
                    sb2 = new StringBuilder();
                }
            }
        }
        char c10 = 0;
        int i13 = 0;
        while (i13 < V.length) {
            if ((i13 != 4 || this.f31901h) && (eVar = Y[i13].get(str6)) != null) {
                if (str7 == null) {
                    this.f31898e[i13].remove(str6);
                } else {
                    Pair<Integer, Integer> q10 = q(str7);
                    if (eVar.f31929c != ((Integer) q10.first).intValue() && eVar.f31929c != ((Integer) q10.second).intValue()) {
                        int i14 = eVar.f31930d;
                        if (i14 != -1 && (i14 == ((Integer) q10.first).intValue() || eVar.f31930d == ((Integer) q10.second).intValue())) {
                            i10 = eVar.f31930d;
                        } else {
                            int i15 = eVar.f31929c;
                            if (i15 != i12 && i15 != 7 && i15 != i11) {
                                if (f31887t) {
                                    StringBuilder a11 = androidx.activity.result.d.a("Given tag (", str6, ") value didn't match with one of expected formats: ");
                                    String[] strArr = R;
                                    a11.append(strArr[eVar.f31929c]);
                                    String str9 = "";
                                    if (eVar.f31930d == -1) {
                                        sb3 = "";
                                    } else {
                                        StringBuilder a12 = android.support.v4.media.d.a(", ");
                                        a12.append(strArr[eVar.f31930d]);
                                        sb3 = a12.toString();
                                    }
                                    a11.append(sb3);
                                    a11.append(" (guess: ");
                                    a11.append(strArr[((Integer) q10.first).intValue()]);
                                    if (((Integer) q10.second).intValue() != -1) {
                                        StringBuilder a13 = android.support.v4.media.d.a(", ");
                                        a13.append(strArr[((Integer) q10.second).intValue()]);
                                        str9 = a13.toString();
                                    }
                                    a11.append(str9);
                                    a11.append(")");
                                    str3 = a11.toString();
                                    Log.d(str8, str3);
                                }
                            } else {
                                i10 = i15;
                            }
                        }
                    } else {
                        i10 = eVar.f31929c;
                    }
                    switch (i10) {
                        case 1:
                            str4 = str8;
                            HashMap<String, d> hashMap2 = this.f31898e[i13];
                            i12 = 1;
                            if (str7.length() == 1 && str7.charAt(0) >= '0' && str7.charAt(0) <= '1') {
                                dVar = new d(new byte[]{(byte) (str7.charAt(0) - '0')}, 1, 1);
                            } else {
                                byte[] bytes = str7.getBytes(f31881b0);
                                dVar = new d(bytes, 1, bytes.length);
                            }
                            hashMap2.put(str6, dVar);
                            str8 = str4;
                            break;
                        case 2:
                        case 7:
                            str5 = str8;
                            hashMap = this.f31898e[i13];
                            a10 = d.a(str7);
                            hashMap.put(str6, a10);
                            str8 = str5;
                            i12 = 1;
                            break;
                        case 3:
                            str5 = str8;
                            String[] split = str7.split(",", -1);
                            int[] iArr = new int[split.length];
                            for (int i16 = 0; i16 < split.length; i16++) {
                                iArr[i16] = Integer.parseInt(split[i16]);
                            }
                            hashMap = this.f31898e[i13];
                            a10 = d.f(iArr, this.f31900g);
                            hashMap.put(str6, a10);
                            str8 = str5;
                            i12 = 1;
                            break;
                        case 4:
                            str5 = str8;
                            String[] split2 = str7.split(",", -1);
                            long[] jArr = new long[split2.length];
                            for (int i17 = 0; i17 < split2.length; i17++) {
                                jArr[i17] = Long.parseLong(split2[i17]);
                            }
                            hashMap = this.f31898e[i13];
                            a10 = d.c(jArr, this.f31900g);
                            hashMap.put(str6, a10);
                            str8 = str5;
                            i12 = 1;
                            break;
                        case 5:
                            str5 = str8;
                            String[] split3 = str7.split(",", -1);
                            f[] fVarArr = new f[split3.length];
                            for (int i18 = 0; i18 < split3.length; i18++) {
                                String[] split4 = split3[i18].split("/", -1);
                                fVarArr[i18] = new f((long) Double.parseDouble(split4[0]), (long) Double.parseDouble(split4[1]));
                            }
                            hashMap = this.f31898e[i13];
                            a10 = d.d(fVarArr, this.f31900g);
                            hashMap.put(str6, a10);
                            str8 = str5;
                            i12 = 1;
                            break;
                        case 6:
                        case 8:
                        case 11:
                        default:
                            str4 = str8;
                            if (f31887t) {
                                str3 = "Data format isn't one of expected formats: " + i10;
                                str8 = str4;
                                Log.d(str8, str3);
                                break;
                            }
                            str8 = str4;
                            break;
                        case 9:
                            str5 = str8;
                            String[] split5 = str7.split(",", -1);
                            int length = split5.length;
                            int[] iArr2 = new int[length];
                            for (int i19 = 0; i19 < split5.length; i19++) {
                                iArr2[i19] = Integer.parseInt(split5[i19]);
                            }
                            HashMap<String, d> hashMap3 = this.f31898e[i13];
                            ByteOrder byteOrder = this.f31900g;
                            ByteBuffer wrap = ByteBuffer.wrap(new byte[S[9] * length]);
                            wrap.order(byteOrder);
                            for (int i20 = 0; i20 < length; i20++) {
                                wrap.putInt(iArr2[i20]);
                            }
                            hashMap3.put(str6, new d(wrap.array(), 9, length));
                            str8 = str5;
                            i12 = 1;
                            break;
                        case 10:
                            String[] split6 = str7.split(",", -1);
                            int length2 = split6.length;
                            f[] fVarArr2 = new f[length2];
                            int i21 = 0;
                            while (i21 < split6.length) {
                                String[] split7 = split6[i21].split("/", -1);
                                fVarArr2[i21] = new f((long) Double.parseDouble(split7[c10]), (long) Double.parseDouble(split7[i12]));
                                i21++;
                                i12 = 1;
                                c10 = 0;
                                split6 = split6;
                                str8 = str8;
                            }
                            str5 = str8;
                            hashMap = this.f31898e[i13];
                            ByteOrder byteOrder2 = this.f31900g;
                            ByteBuffer wrap2 = ByteBuffer.wrap(new byte[S[10] * length2]);
                            wrap2.order(byteOrder2);
                            for (int i22 = 0; i22 < length2; i22++) {
                                f fVar = fVarArr2[i22];
                                wrap2.putInt((int) fVar.f31931a);
                                wrap2.putInt((int) fVar.f31932b);
                            }
                            a10 = new d(wrap2.array(), 10, length2);
                            hashMap.put(str6, a10);
                            str8 = str5;
                            i12 = 1;
                            break;
                        case 12:
                            String[] split8 = str7.split(",", -1);
                            int length3 = split8.length;
                            double[] dArr = new double[length3];
                            for (int i23 = 0; i23 < split8.length; i23++) {
                                dArr[i23] = Double.parseDouble(split8[i23]);
                            }
                            HashMap<String, d> hashMap4 = this.f31898e[i13];
                            ByteOrder byteOrder3 = this.f31900g;
                            ByteBuffer wrap3 = ByteBuffer.wrap(new byte[S[12] * length3]);
                            wrap3.order(byteOrder3);
                            for (int i24 = 0; i24 < length3; i24++) {
                                wrap3.putDouble(dArr[i24]);
                            }
                            hashMap4.put(str6, new d(wrap3.array(), 12, length3));
                            break;
                    }
                }
            }
            i13++;
            i11 = 2;
            c10 = 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:176:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void F(z1.a.b r20) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.a.F(z1.a$b):void");
    }

    public final void G(int i10, int i11) {
        String str;
        if (this.f31898e[i10].isEmpty() || this.f31898e[i11].isEmpty()) {
            if (f31887t) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        d dVar = this.f31898e[i10].get("ImageLength");
        d dVar2 = this.f31898e[i10].get("ImageWidth");
        d dVar3 = this.f31898e[i11].get("ImageLength");
        d dVar4 = this.f31898e[i11].get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            if (!f31887t) {
                return;
            }
            str = "First image does not contain valid size information";
        } else if (dVar3 != null && dVar4 != null) {
            int h10 = dVar.h(this.f31900g);
            int h11 = dVar2.h(this.f31900g);
            int h12 = dVar3.h(this.f31900g);
            int h13 = dVar4.h(this.f31900g);
            if (h10 >= h12 || h11 >= h13) {
                return;
            }
            HashMap<String, d>[] hashMapArr = this.f31898e;
            HashMap<String, d> hashMap = hashMapArr[i10];
            hashMapArr[i10] = hashMapArr[i11];
            hashMapArr[i11] = hashMap;
            return;
        } else if (!f31887t) {
            return;
        } else {
            str = "Second image does not contain valid size information";
        }
        Log.d("ExifInterface", str);
    }

    public final void H(g gVar, int i10) {
        StringBuilder a10;
        String arrays;
        d e10;
        d e11;
        d dVar = this.f31898e[i10].get("DefaultCropSize");
        d dVar2 = this.f31898e[i10].get("SensorTopBorder");
        d dVar3 = this.f31898e[i10].get("SensorLeftBorder");
        d dVar4 = this.f31898e[i10].get("SensorBottomBorder");
        d dVar5 = this.f31898e[i10].get("SensorRightBorder");
        if (dVar != null) {
            if (dVar.f31923a == 5) {
                f[] fVarArr = (f[]) dVar.j(this.f31900g);
                if (fVarArr != null && fVarArr.length == 2) {
                    e10 = d.d(new f[]{fVarArr[0]}, this.f31900g);
                    e11 = d.d(new f[]{fVarArr[1]}, this.f31900g);
                    this.f31898e[i10].put("ImageWidth", e10);
                    this.f31898e[i10].put("ImageLength", e11);
                    return;
                }
                a10 = android.support.v4.media.d.a("Invalid crop size values. cropSize=");
                arrays = Arrays.toString(fVarArr);
                a10.append(arrays);
                Log.w("ExifInterface", a10.toString());
            }
            int[] iArr = (int[]) dVar.j(this.f31900g);
            if (iArr != null && iArr.length == 2) {
                e10 = d.e(iArr[0], this.f31900g);
                e11 = d.e(iArr[1], this.f31900g);
                this.f31898e[i10].put("ImageWidth", e10);
                this.f31898e[i10].put("ImageLength", e11);
                return;
            }
            a10 = android.support.v4.media.d.a("Invalid crop size values. cropSize=");
            arrays = Arrays.toString(iArr);
            a10.append(arrays);
            Log.w("ExifInterface", a10.toString());
        } else if (dVar2 != null && dVar3 != null && dVar4 != null && dVar5 != null) {
            int h10 = dVar2.h(this.f31900g);
            int h11 = dVar4.h(this.f31900g);
            int h12 = dVar5.h(this.f31900g);
            int h13 = dVar3.h(this.f31900g);
            if (h11 > h10 && h12 > h13) {
                d e12 = d.e(h11 - h10, this.f31900g);
                d e13 = d.e(h12 - h13, this.f31900g);
                this.f31898e[i10].put("ImageLength", e12);
                this.f31898e[i10].put("ImageWidth", e13);
            }
        } else {
            d dVar6 = this.f31898e[i10].get("ImageLength");
            d dVar7 = this.f31898e[i10].get("ImageWidth");
            if (dVar6 == null || dVar7 == null) {
                d dVar8 = this.f31898e[i10].get("JPEGInterchangeFormat");
                d dVar9 = this.f31898e[i10].get("JPEGInterchangeFormatLength");
                if (dVar8 != null && dVar9 != null) {
                    int h14 = dVar8.h(this.f31900g);
                    int h15 = dVar8.h(this.f31900g);
                    gVar.b(h14);
                    byte[] bArr = new byte[h15];
                    gVar.read(bArr);
                    h(new b(bArr), h14, i10);
                }
            }
        }
    }

    public final void I() {
        G(0, 5);
        G(0, 4);
        G(5, 4);
        d dVar = this.f31898e[1].get("PixelXDimension");
        d dVar2 = this.f31898e[1].get("PixelYDimension");
        if (dVar != null && dVar2 != null) {
            this.f31898e[0].put("ImageWidth", dVar);
            this.f31898e[0].put("ImageLength", dVar2);
        }
        if (this.f31898e[4].isEmpty() && s(this.f31898e[5])) {
            HashMap<String, d>[] hashMapArr = this.f31898e;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        if (!s(this.f31898e[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        A(0, "ThumbnailOrientation", "Orientation");
        A(0, "ThumbnailImageLength", "ImageLength");
        A(0, "ThumbnailImageWidth", "ImageWidth");
        A(5, "ThumbnailOrientation", "Orientation");
        A(5, "ThumbnailImageLength", "ImageLength");
        A(5, "ThumbnailImageWidth", "ImageWidth");
        A(4, "Orientation", "ThumbnailOrientation");
        A(4, "ImageLength", "ThumbnailImageLength");
        A(4, "ImageWidth", "ThumbnailImageWidth");
    }

    public final void J(c cVar) {
        short s10;
        e[][] eVarArr = V;
        int[] iArr = new int[eVarArr.length];
        int[] iArr2 = new int[eVarArr.length];
        for (e eVar : W) {
            z(eVar.f31928b);
        }
        if (this.f31901h) {
            if (this.f31902i) {
                z("StripOffsets");
                z("StripByteCounts");
            } else {
                z("JPEGInterchangeFormat");
                z("JPEGInterchangeFormatLength");
            }
        }
        for (int i10 = 0; i10 < V.length; i10++) {
            for (Object obj : this.f31898e[i10].entrySet().toArray()) {
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getValue() == null) {
                    this.f31898e[i10].remove(entry.getKey());
                }
            }
        }
        if (!this.f31898e[1].isEmpty()) {
            this.f31898e[0].put(W[1].f31928b, d.b(0L, this.f31900g));
        }
        if (!this.f31898e[2].isEmpty()) {
            this.f31898e[0].put(W[2].f31928b, d.b(0L, this.f31900g));
        }
        if (!this.f31898e[3].isEmpty()) {
            this.f31898e[1].put(W[3].f31928b, d.b(0L, this.f31900g));
        }
        if (this.f31901h) {
            if (this.f31902i) {
                this.f31898e[4].put("StripOffsets", d.e(0, this.f31900g));
                this.f31898e[4].put("StripByteCounts", d.e(this.f31905l, this.f31900g));
            } else {
                this.f31898e[4].put("JPEGInterchangeFormat", d.b(0L, this.f31900g));
                this.f31898e[4].put("JPEGInterchangeFormatLength", d.b(this.f31905l, this.f31900g));
            }
        }
        for (int i11 = 0; i11 < V.length; i11++) {
            int i12 = 0;
            for (Map.Entry<String, d> entry2 : this.f31898e[i11].entrySet()) {
                d value = entry2.getValue();
                value.getClass();
                int i13 = S[value.f31923a] * value.f31924b;
                if (i13 > 4) {
                    i12 += i13;
                }
            }
            iArr2[i11] = iArr2[i11] + i12;
        }
        int i14 = 8;
        for (int i15 = 0; i15 < V.length; i15++) {
            if (!this.f31898e[i15].isEmpty()) {
                iArr[i15] = i14;
                i14 = (this.f31898e[i15].size() * 12) + 2 + 4 + iArr2[i15] + i14;
            }
        }
        if (this.f31901h) {
            if (this.f31902i) {
                this.f31898e[4].put("StripOffsets", d.e(i14, this.f31900g));
            } else {
                this.f31898e[4].put("JPEGInterchangeFormat", d.b(i14, this.f31900g));
            }
            this.f31904k = i14;
            i14 += this.f31905l;
        }
        if (this.f31897d == 4) {
            i14 += 8;
        }
        if (f31887t) {
            for (int i16 = 0; i16 < V.length; i16++) {
                Log.d("ExifInterface", String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i16), Integer.valueOf(iArr[i16]), Integer.valueOf(this.f31898e[i16].size()), Integer.valueOf(iArr2[i16]), Integer.valueOf(i14)));
            }
        }
        if (!this.f31898e[1].isEmpty()) {
            this.f31898e[0].put(W[1].f31928b, d.b(iArr[1], this.f31900g));
        }
        if (!this.f31898e[2].isEmpty()) {
            this.f31898e[0].put(W[2].f31928b, d.b(iArr[2], this.f31900g));
        }
        if (!this.f31898e[3].isEmpty()) {
            this.f31898e[1].put(W[3].f31928b, d.b(iArr[3], this.f31900g));
        }
        int i17 = this.f31897d;
        if (i17 != 4) {
            if (i17 != 13) {
                if (i17 == 14) {
                    cVar.write(K);
                    cVar.b(i14);
                }
            } else {
                cVar.b(i14);
                cVar.write(F);
            }
        } else {
            cVar.h((short) i14);
            cVar.write(f31882c0);
        }
        if (this.f31900g == ByteOrder.BIG_ENDIAN) {
            s10 = 19789;
        } else {
            s10 = 18761;
        }
        cVar.h(s10);
        cVar.f31922b = this.f31900g;
        cVar.h((short) 42);
        cVar.b((int) 8);
        for (int i18 = 0; i18 < V.length; i18++) {
            if (!this.f31898e[i18].isEmpty()) {
                cVar.h((short) this.f31898e[i18].size());
                int size = (this.f31898e[i18].size() * 12) + iArr[i18] + 2 + 4;
                for (Map.Entry<String, d> entry3 : this.f31898e[i18].entrySet()) {
                    int i19 = Y[i18].get(entry3.getKey()).f31927a;
                    d value2 = entry3.getValue();
                    value2.getClass();
                    int i20 = S[value2.f31923a] * value2.f31924b;
                    cVar.h((short) i19);
                    cVar.h((short) value2.f31923a);
                    cVar.b(value2.f31924b);
                    if (i20 > 4) {
                        cVar.b(size);
                        size += i20;
                    } else {
                        cVar.write(value2.f31926d);
                        if (i20 < 4) {
                            while (i20 < 4) {
                                cVar.a(0);
                                i20++;
                            }
                        }
                    }
                }
                if (i18 == 0 && !this.f31898e[4].isEmpty()) {
                    cVar.b(iArr[4]);
                } else {
                    cVar.b((int) 0);
                }
                for (Map.Entry<String, d> entry4 : this.f31898e[i18].entrySet()) {
                    byte[] bArr = entry4.getValue().f31926d;
                    if (bArr.length > 4) {
                        cVar.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        if (this.f31901h) {
            cVar.write(o());
        }
        if (this.f31897d == 14 && i14 % 2 == 1) {
            cVar.a(0);
        }
        cVar.f31922b = ByteOrder.BIG_ENDIAN;
    }

    public final void a() {
        String d10 = d("DateTimeOriginal");
        if (d10 != null && d("DateTime") == null) {
            this.f31898e[0].put("DateTime", d.a(d10));
        }
        if (d("ImageWidth") == null) {
            this.f31898e[0].put("ImageWidth", d.b(0L, this.f31900g));
        }
        if (d("ImageLength") == null) {
            this.f31898e[0].put("ImageLength", d.b(0L, this.f31900g));
        }
        if (d("Orientation") == null) {
            this.f31898e[0].put("Orientation", d.b(0L, this.f31900g));
        }
        if (d("LightSource") == null) {
            this.f31898e[1].put("LightSource", d.b(0L, this.f31900g));
        }
    }

    public final String d(String str) {
        String sb2;
        if (str != null) {
            d f10 = f(str);
            if (f10 != null) {
                if (!Z.contains(str)) {
                    return f10.i(this.f31900g);
                }
                if (str.equals("GPSTimeStamp")) {
                    int i10 = f10.f31923a;
                    if (i10 != 5 && i10 != 10) {
                        StringBuilder a10 = android.support.v4.media.d.a("GPS Timestamp format is not rational. format=");
                        a10.append(f10.f31923a);
                        sb2 = a10.toString();
                    } else {
                        f[] fVarArr = (f[]) f10.j(this.f31900g);
                        if (fVarArr != null && fVarArr.length == 3) {
                            f fVar = fVarArr[0];
                            f fVar2 = fVarArr[1];
                            f fVar3 = fVarArr[2];
                            return String.format("%02d:%02d:%02d", Integer.valueOf((int) (((float) fVar.f31931a) / ((float) fVar.f31932b))), Integer.valueOf((int) (((float) fVar2.f31931a) / ((float) fVar2.f31932b))), Integer.valueOf((int) (((float) fVar3.f31931a) / ((float) fVar3.f31932b))));
                        }
                        StringBuilder a11 = android.support.v4.media.d.a("Invalid GPS Timestamp array. array=");
                        a11.append(Arrays.toString(fVarArr));
                        sb2 = a11.toString();
                    }
                    Log.w("ExifInterface", sb2);
                    return null;
                }
                try {
                    return Double.toString(f10.g(this.f31900g));
                } catch (NumberFormatException unused) {
                }
            }
            return null;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    public final int e(int i10, String str) {
        d f10 = f(str);
        if (f10 == null) {
            return i10;
        }
        try {
            return f10.h(this.f31900g);
        } catch (NumberFormatException unused) {
            return i10;
        }
    }

    public final d f(String str) {
        if (str != null) {
            if ("ISOSpeedRatings".equals(str)) {
                if (f31887t) {
                    Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
                }
                str = "PhotographicSensitivity";
            }
            for (int i10 = 0; i10 < V.length; i10++) {
                d dVar = this.f31898e[i10].get(str);
                if (dVar != null) {
                    return dVar;
                }
            }
            return null;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    public final void g(g gVar) {
        String str;
        String str2;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                b.C0606b.a(mediaMetadataRetriever, new C0605a(gVar));
                String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                String str3 = null;
                if ("yes".equals(extractMetadata3)) {
                    str3 = mediaMetadataRetriever.extractMetadata(29);
                    str = mediaMetadataRetriever.extractMetadata(30);
                    str2 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(extractMetadata4)) {
                    str3 = mediaMetadataRetriever.extractMetadata(18);
                    str = mediaMetadataRetriever.extractMetadata(19);
                    str2 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    str = null;
                    str2 = null;
                }
                if (str3 != null) {
                    this.f31898e[0].put("ImageWidth", d.e(Integer.parseInt(str3), this.f31900g));
                }
                if (str != null) {
                    this.f31898e[0].put("ImageLength", d.e(Integer.parseInt(str), this.f31900g));
                }
                if (str2 != null) {
                    int i10 = 1;
                    int parseInt = Integer.parseInt(str2);
                    if (parseInt == 90) {
                        i10 = 6;
                    } else if (parseInt == 180) {
                        i10 = 3;
                    } else if (parseInt == 270) {
                        i10 = 8;
                    }
                    this.f31898e[0].put("Orientation", d.e(i10, this.f31900g));
                }
                if (extractMetadata != null && extractMetadata2 != null) {
                    int parseInt2 = Integer.parseInt(extractMetadata);
                    int parseInt3 = Integer.parseInt(extractMetadata2);
                    if (parseInt3 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    gVar.b(parseInt2);
                    byte[] bArr = new byte[6];
                    if (gVar.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i11 = parseInt2 + 6;
                    int i12 = parseInt3 - 6;
                    if (!Arrays.equals(bArr, f31882c0)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i12];
                    if (gVar.read(bArr2) != i12) {
                        throw new IOException("Can't read exif");
                    }
                    this.f31908o = i11;
                    x(0, bArr2);
                }
                if (f31887t) {
                    Log.d("ExifInterface", "Heif meta: " + str3 + "x" + str + ", rotation " + str2);
                }
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } finally {
            mediaMetadataRetriever.release();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:206:0x01af, code lost:
        r19.f31918b = r18.f31900g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x01b3, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00ae A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x016f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(z1.a.b r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.a.h(z1.a$b, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:259:0x00ce, code lost:
        if (r8 != null) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0111 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0147 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:312:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0113 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int i(java.io.BufferedInputStream r18) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.a.i(java.io.BufferedInputStream):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(z1.a.g r6) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.a.j(z1.a$g):void");
    }

    public final void k(b bVar) {
        if (f31887t) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.f31918b = ByteOrder.BIG_ENDIAN;
        byte[] bArr = E;
        bVar.a(bArr.length);
        int length = bArr.length + 0;
        while (true) {
            try {
                int readInt = bVar.readInt();
                int i10 = length + 4;
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) == 4) {
                    int i11 = i10 + 4;
                    if (i11 == 16 && !Arrays.equals(bArr2, G)) {
                        throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                    }
                    if (!Arrays.equals(bArr2, H)) {
                        if (Arrays.equals(bArr2, F)) {
                            byte[] bArr3 = new byte[readInt];
                            if (bVar.read(bArr3) == readInt) {
                                int readInt2 = bVar.readInt();
                                CRC32 crc32 = new CRC32();
                                crc32.update(bArr2);
                                crc32.update(bArr3);
                                if (((int) crc32.getValue()) == readInt2) {
                                    this.f31908o = i11;
                                    x(0, bArr3);
                                    I();
                                    F(new b(bArr3));
                                    return;
                                }
                                throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                            }
                            throw new IOException("Failed to read given length for given PNG chunk type: " + z1.b.a(bArr2));
                        }
                        int i12 = readInt + 4;
                        bVar.a(i12);
                        length = i11 + i12;
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void l(b bVar) {
        boolean z10 = f31887t;
        if (z10) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.a(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.read(bArr);
        bVar.read(bArr2);
        bVar.read(bArr3);
        int i10 = ByteBuffer.wrap(bArr).getInt();
        int i11 = ByteBuffer.wrap(bArr2).getInt();
        int i12 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i11];
        bVar.a(i10 - bVar.f31919c);
        bVar.read(bArr4);
        h(new b(bArr4), i10, 5);
        bVar.a(i12 - bVar.f31919c);
        bVar.f31918b = ByteOrder.BIG_ENDIAN;
        int readInt = bVar.readInt();
        if (z10) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i13 = 0; i13 < readInt; i13++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == U.f31927a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                d e10 = d.e(readShort, this.f31900g);
                d e11 = d.e(readShort2, this.f31900g);
                this.f31898e[0].put("ImageLength", e10);
                this.f31898e[0].put("ImageWidth", e11);
                if (f31887t) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            bVar.a(readUnsignedShort2);
        }
    }

    public final void m(g gVar) {
        d dVar;
        u(gVar);
        y(gVar, 0);
        H(gVar, 0);
        H(gVar, 5);
        H(gVar, 4);
        I();
        if (this.f31897d == 8 && (dVar = this.f31898e[1].get("MakerNote")) != null) {
            g gVar2 = new g(dVar.f31926d);
            gVar2.f31918b = this.f31900g;
            gVar2.a(6);
            y(gVar2, 9);
            d dVar2 = this.f31898e[9].get("ColorSpace");
            if (dVar2 != null) {
                this.f31898e[1].put("ColorSpace", dVar2);
            }
        }
    }

    public final void n(g gVar) {
        if (f31887t) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + gVar);
        }
        m(gVar);
        d dVar = this.f31898e[0].get("JpgFromRaw");
        if (dVar != null) {
            h(new b(dVar.f31926d), (int) dVar.f31925c, 5);
        }
        d dVar2 = this.f31898e[0].get("ISO");
        d dVar3 = this.f31898e[1].get("PhotographicSensitivity");
        if (dVar2 == null || dVar3 != null) {
            return;
        }
        this.f31898e[1].put("PhotographicSensitivity", dVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x00b6: MOVE  (r4 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:143:0x00b6 */
    /* JADX WARN: Removed duplicated region for block: B:112:0x006b A[Catch: Exception -> 0x0092, all -> 0x00b5, TRY_ENTER, TryCatch #3 {all -> 0x00b5, blocks: (B:109:0x0055, B:112:0x006b, B:114:0x0077, B:121:0x0086, B:122:0x008b, B:123:0x008c, B:124:0x0091, B:135:0x00a3), top: B:150:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x008c A[Catch: Exception -> 0x0092, all -> 0x00b5, TryCatch #3 {all -> 0x00b5, blocks: (B:109:0x0055, B:112:0x006b, B:114:0x0077, B:121:0x0086, B:122:0x008b, B:123:0x008c, B:124:0x0091, B:135:0x00a3), top: B:150:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v1, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.FileDescriptor] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v9, types: [android.content.res.AssetManager$AssetInputStream, java.io.Closeable, java.io.InputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] o() {
        /*
            Method dump skipped, instructions count: 198
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.a.o():byte[]");
    }

    public final void p(b bVar) {
        if (f31887t) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.f31918b = ByteOrder.LITTLE_ENDIAN;
        bVar.a(I.length);
        int readInt = bVar.readInt() + 8;
        byte[] bArr = J;
        bVar.a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) == 4) {
                    int readInt2 = bVar.readInt();
                    int i10 = length + 4 + 4;
                    if (Arrays.equals(K, bArr2)) {
                        byte[] bArr3 = new byte[readInt2];
                        if (bVar.read(bArr3) == readInt2) {
                            this.f31908o = i10;
                            x(0, bArr3);
                            F(new b(bArr3));
                            return;
                        }
                        throw new IOException("Failed to read given length for given PNG chunk type: " + z1.b.a(bArr2));
                    }
                    if (readInt2 % 2 == 1) {
                        readInt2++;
                    }
                    length = i10 + readInt2;
                    if (length == readInt) {
                        return;
                    }
                    if (length <= readInt) {
                        bVar.a(readInt2);
                    } else {
                        throw new IOException("Encountered WebP file with invalid chunk size");
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void r(b bVar, HashMap hashMap) {
        d dVar = (d) hashMap.get("JPEGInterchangeFormat");
        d dVar2 = (d) hashMap.get("JPEGInterchangeFormatLength");
        if (dVar == null || dVar2 == null) {
            return;
        }
        int h10 = dVar.h(this.f31900g);
        int h11 = dVar2.h(this.f31900g);
        if (this.f31897d == 7) {
            h10 += this.f31909p;
        }
        if (h10 > 0 && h11 > 0) {
            this.f31901h = true;
            if (this.f31894a == null && this.f31896c == null && this.f31895b == null) {
                byte[] bArr = new byte[h11];
                bVar.skip(h10);
                bVar.read(bArr);
                this.f31906m = bArr;
            }
            this.f31904k = h10;
            this.f31905l = h11;
        }
        if (f31887t) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + h10 + ", length: " + h11);
        }
    }

    public final boolean s(HashMap hashMap) {
        d dVar = (d) hashMap.get("ImageLength");
        d dVar2 = (d) hashMap.get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            return false;
        }
        return dVar.h(this.f31900g) <= 512 && dVar2.h(this.f31900g) <= 512;
    }

    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0037 A[Catch: all -> 0x0088, UnsupportedOperationException -> 0x008a, IOException | UnsupportedOperationException -> 0x008c, TryCatch #0 {all -> 0x0088, blocks: (B:65:0x0004, B:67:0x0009, B:68:0x0015, B:77:0x0037, B:79:0x0042, B:87:0x0058, B:82:0x0049, B:85:0x0051, B:86:0x0055, B:88:0x0062, B:90:0x006b, B:92:0x0071, B:94:0x0077, B:96:0x007d, B:105:0x008d, B:107:0x0091), top: B:118:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0062 A[Catch: all -> 0x0088, UnsupportedOperationException -> 0x008a, IOException | UnsupportedOperationException -> 0x008c, TryCatch #0 {all -> 0x0088, blocks: (B:65:0x0004, B:67:0x0009, B:68:0x0015, B:77:0x0037, B:79:0x0042, B:87:0x0058, B:82:0x0049, B:85:0x0051, B:86:0x0055, B:88:0x0062, B:90:0x006b, B:92:0x0071, B:94:0x0077, B:96:0x007d, B:105:0x008d, B:107:0x0091), top: B:118:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t(java.io.InputStream r7) {
        /*
            r6 = this;
            if (r7 == 0) goto Lac
            r0 = 0
            r1 = 0
        L4:
            z1.a$e[][] r2 = z1.a.V     // Catch: java.lang.Throwable -> L88 java.lang.UnsupportedOperationException -> L8a java.io.IOException -> L8c
            int r2 = r2.length     // Catch: java.lang.Throwable -> L88 java.lang.UnsupportedOperationException -> L8a java.io.IOException -> L8c
            if (r1 >= r2) goto L15
            java.util.HashMap<java.lang.String, z1.a$d>[] r2 = r6.f31898e     // Catch: java.lang.Throwable -> L88 java.lang.UnsupportedOperationException -> L8a java.io.IOException -> L8c
            java.util.HashMap r3 = new java.util.HashMap     // Catch: java.lang.Throwable -> L88 java.lang.UnsupportedOperationException -> L8a java.io.IOException -> L8c
            r3.<init>()     // Catch: java.lang.Throwable -> L88 java.lang.UnsupportedOperationException -> L8a java.io.IOException -> L8c
            r2[r1] = r3     // Catch: java.lang.Throwable -> L88 java.lang.UnsupportedOperationException -> L8a java.io.IOException -> L8c
            int r1 = r1 + 1
            goto L4
        L15:
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L88 java.lang.UnsupportedOperationException -> L8a java.io.IOException -> L8c
            r2 = 5000(0x1388, float:7.006E-42)
            r1.<init>(r7, r2)     // Catch: java.lang.Throwable -> L88 java.lang.UnsupportedOperationException -> L8a java.io.IOException -> L8c
            int r7 = r6.i(r1)     // Catch: java.lang.Throwable -> L88 java.lang.UnsupportedOperationException -> L8a java.io.IOException -> L8c
            r6.f31897d = r7     // Catch: java.lang.Throwable -> L88 java.lang.UnsupportedOperationException -> L8a java.io.IOException -> L8c
            r2 = 14
            r3 = 13
            r4 = 9
            r5 = 4
            if (r7 == r5) goto L34
            if (r7 == r4) goto L34
            if (r7 == r3) goto L34
            if (r7 != r2) goto L32
            goto L34
        L32:
            r7 = 1
            goto L35
        L34:
            r7 = 0
        L35:
            if (r7 == 0) goto L62
            z1.a$g r7 = new z1.a$g     // Catch: java.lang.Throwable -> L88 java.lang.UnsupportedOperationException -> L8a java.io.IOException -> L8c
            r7.<init>(r1)     // Catch: java.lang.Throwable -> L88 java.lang.UnsupportedOperationException -> L8a java.io.IOException -> L8c
            int r0 = r6.f31897d     // Catch: java.lang.Throwable -> L88 java.lang.UnsupportedOperationException -> L8a java.io.IOException -> L8c
            r1 = 12
            if (r0 != r1) goto L46
            r6.g(r7)     // Catch: java.lang.Throwable -> L88 java.lang.UnsupportedOperationException -> L8a java.io.IOException -> L8c
            goto L58
        L46:
            r1 = 7
            if (r0 != r1) goto L4d
            r6.j(r7)     // Catch: java.lang.Throwable -> L88 java.lang.UnsupportedOperationException -> L8a java.io.IOException -> L8c
            goto L58
        L4d:
            r1 = 10
            if (r0 != r1) goto L55
            r6.n(r7)     // Catch: java.lang.Throwable -> L88 java.lang.UnsupportedOperationException -> L8a java.io.IOException -> L8c
            goto L58
        L55:
            r6.m(r7)     // Catch: java.lang.Throwable -> L88 java.lang.UnsupportedOperationException -> L8a java.io.IOException -> L8c
        L58:
            int r0 = r6.f31908o     // Catch: java.lang.Throwable -> L88 java.lang.UnsupportedOperationException -> L8a java.io.IOException -> L8c
            long r0 = (long) r0     // Catch: java.lang.Throwable -> L88 java.lang.UnsupportedOperationException -> L8a java.io.IOException -> L8c
            r7.b(r0)     // Catch: java.lang.Throwable -> L88 java.lang.UnsupportedOperationException -> L8a java.io.IOException -> L8c
            r6.F(r7)     // Catch: java.lang.Throwable -> L88 java.lang.UnsupportedOperationException -> L8a java.io.IOException -> L8c
            goto L80
        L62:
            z1.a$b r7 = new z1.a$b     // Catch: java.lang.Throwable -> L88 java.lang.UnsupportedOperationException -> L8a java.io.IOException -> L8c
            r7.<init>(r1)     // Catch: java.lang.Throwable -> L88 java.lang.UnsupportedOperationException -> L8a java.io.IOException -> L8c
            int r1 = r6.f31897d     // Catch: java.lang.Throwable -> L88 java.lang.UnsupportedOperationException -> L8a java.io.IOException -> L8c
            if (r1 != r5) goto L6f
            r6.h(r7, r0, r0)     // Catch: java.lang.Throwable -> L88 java.lang.UnsupportedOperationException -> L8a java.io.IOException -> L8c
            goto L80
        L6f:
            if (r1 != r3) goto L75
            r6.k(r7)     // Catch: java.lang.Throwable -> L88 java.lang.UnsupportedOperationException -> L8a java.io.IOException -> L8c
            goto L80
        L75:
            if (r1 != r4) goto L7b
            r6.l(r7)     // Catch: java.lang.Throwable -> L88 java.lang.UnsupportedOperationException -> L8a java.io.IOException -> L8c
            goto L80
        L7b:
            if (r1 != r2) goto L80
            r6.p(r7)     // Catch: java.lang.Throwable -> L88 java.lang.UnsupportedOperationException -> L8a java.io.IOException -> L8c
        L80:
            r6.a()
            boolean r7 = z1.a.f31887t
            if (r7 == 0) goto La0
            goto L9d
        L88:
            r7 = move-exception
            goto La1
        L8a:
            r7 = move-exception
            goto L8d
        L8c:
            r7 = move-exception
        L8d:
            boolean r0 = z1.a.f31887t     // Catch: java.lang.Throwable -> L88
            if (r0 == 0) goto L98
            java.lang.String r1 = "ExifInterface"
            java.lang.String r2 = "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface."
            android.util.Log.w(r1, r2, r7)     // Catch: java.lang.Throwable -> L88
        L98:
            r6.a()
            if (r0 == 0) goto La0
        L9d:
            r6.v()
        La0:
            return
        La1:
            r6.a()
            boolean r0 = z1.a.f31887t
            if (r0 == 0) goto Lab
            r6.v()
        Lab:
            throw r7
        Lac:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r0 = "inputstream shouldn't be null"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.a.t(java.io.InputStream):void");
    }

    public final void u(b bVar) {
        ByteOrder w10 = w(bVar);
        this.f31900g = w10;
        bVar.f31918b = w10;
        int readUnsignedShort = bVar.readUnsignedShort();
        int i10 = this.f31897d;
        if (i10 != 7 && i10 != 10 && readUnsignedShort != 42) {
            StringBuilder a10 = android.support.v4.media.d.a("Invalid start code: ");
            a10.append(Integer.toHexString(readUnsignedShort));
            throw new IOException(a10.toString());
        }
        int readInt = bVar.readInt();
        if (readInt >= 8) {
            int i11 = readInt - 8;
            if (i11 > 0) {
                bVar.a(i11);
                return;
            }
            return;
        }
        throw new IOException(u0.a("Invalid first Ifd offset: ", readInt));
    }

    public final void v() {
        for (int i10 = 0; i10 < this.f31898e.length; i10++) {
            StringBuilder a10 = e2.a("The size of tag group[", i10, "]: ");
            a10.append(this.f31898e[i10].size());
            Log.d("ExifInterface", a10.toString());
            for (Map.Entry<String, d> entry : this.f31898e[i10].entrySet()) {
                d value = entry.getValue();
                StringBuilder a11 = android.support.v4.media.d.a("tagName: ");
                a11.append(entry.getKey());
                a11.append(", tagType: ");
                a11.append(value.toString());
                a11.append(", tagValue: '");
                a11.append(value.i(this.f31900g));
                a11.append("'");
                Log.d("ExifInterface", a11.toString());
            }
        }
    }

    public final void x(int i10, byte[] bArr) {
        g gVar = new g(bArr);
        u(gVar);
        y(gVar, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:231:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x02a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y(z1.a.g r22, int r23) {
        /*
            Method dump skipped, instructions count: 933
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.a.y(z1.a$g, int):void");
    }

    public final void z(String str) {
        for (int i10 = 0; i10 < V.length; i10++) {
            this.f31898e[i10].remove(str);
        }
    }

    public a(String str) {
        boolean z10;
        e[][] eVarArr = V;
        this.f31898e = new HashMap[eVarArr.length];
        this.f31899f = new HashSet(eVarArr.length);
        this.f31900g = ByteOrder.BIG_ENDIAN;
        if (str != null) {
            FileInputStream fileInputStream = null;
            this.f31896c = null;
            this.f31894a = str;
            try {
                FileInputStream fileInputStream2 = new FileInputStream(str);
                try {
                    try {
                        b.a.c(fileInputStream2.getFD(), 0L, OsConstants.SEEK_CUR);
                        z10 = true;
                    } catch (Exception unused) {
                        if (f31887t) {
                            Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                        }
                        z10 = false;
                    }
                    if (z10) {
                        this.f31895b = fileInputStream2.getFD();
                    } else {
                        this.f31895b = null;
                    }
                    t(fileInputStream2);
                    z1.b.b(fileInputStream2);
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    z1.b.b(fileInputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            throw new NullPointerException("filename cannot be null");
        }
    }
}
