package h2;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.activity.i;
import h2.e;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes.dex */
public final class d implements Closeable {

    /* renamed from: a */
    public final File f15745a;

    /* renamed from: b */
    public final long f15746b;

    /* renamed from: c */
    public final File f15747c;

    /* renamed from: d */
    public final RandomAccessFile f15748d;

    /* renamed from: e */
    public final FileChannel f15749e;

    /* renamed from: f */
    public final FileLock f15750f;

    /* loaded from: classes.dex */
    public static class a extends File {

        /* renamed from: a */
        public long f15751a;

        public a(File file, String str) {
            super(file, str);
            this.f15751a = -1L;
        }
    }

    public d(File file, File file2) {
        StringBuilder a10 = android.support.v4.media.d.a("MultiDexExtractor(");
        a10.append(file.getPath());
        a10.append(", ");
        a10.append(file2.getPath());
        a10.append(")");
        Log.i("MultiDex", a10.toString());
        this.f15745a = file;
        this.f15747c = file2;
        this.f15746b = j(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.f15748d = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.f15749e = channel;
            try {
                Log.i("MultiDex", "Blocking on lock " + file3.getPath());
                this.f15750f = channel.lock();
                Log.i("MultiDex", file3.getPath() + " locked");
            } catch (IOException e10) {
                e = e10;
                a(this.f15749e);
                throw e;
            } catch (Error e11) {
                e = e11;
                a(this.f15749e);
                throw e;
            } catch (RuntimeException e12) {
                e = e12;
                a(this.f15749e);
                throw e;
            }
        } catch (IOException | Error | RuntimeException e13) {
            a(this.f15748d);
            throw e13;
        }
    }

    public static void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e10) {
            Log.w("MultiDex", "Failed to close resource", e10);
        }
    }

    public static void b(ZipFile zipFile, ZipEntry zipEntry, a aVar, String str) {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File createTempFile = File.createTempFile(a.b.b("tmp-", str), ".zip", aVar.getParentFile());
        StringBuilder a10 = android.support.v4.media.d.a("Extracting ");
        a10.append(createTempFile.getPath());
        Log.i("MultiDex", a10.toString());
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
            ZipEntry zipEntry2 = new ZipEntry("classes.dex");
            zipEntry2.setTime(zipEntry.getTime());
            zipOutputStream.putNextEntry(zipEntry2);
            byte[] bArr = new byte[DfuBaseService.ERROR_CONNECTION_MASK];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                zipOutputStream.write(bArr, 0, read);
            }
            zipOutputStream.closeEntry();
            zipOutputStream.close();
            if (createTempFile.setReadOnly()) {
                Log.i("MultiDex", "Renaming to " + aVar.getPath());
                if (createTempFile.renameTo(aVar)) {
                    return;
                }
                throw new IOException("Failed to rename \"" + createTempFile.getAbsolutePath() + "\" to \"" + aVar.getAbsolutePath() + "\"");
            }
            throw new IOException("Failed to mark readonly \"" + createTempFile.getAbsolutePath() + "\" (tmp of \"" + aVar.getAbsolutePath() + "\")");
        } finally {
            a(inputStream);
            createTempFile.delete();
        }
    }

    public static long h(File file) {
        long lastModified = file.lastModified();
        return lastModified == -1 ? lastModified - 1 : lastModified;
    }

    public static long j(File file) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            e.a a10 = e.a(randomAccessFile);
            CRC32 crc32 = new CRC32();
            long j10 = a10.f15753b;
            randomAccessFile.seek(a10.f15752a);
            int min = (int) Math.min(16384L, j10);
            byte[] bArr = new byte[DfuBaseService.ERROR_CONNECTION_MASK];
            while (true) {
                int read = randomAccessFile.read(bArr, 0, min);
                if (read == -1) {
                    break;
                }
                crc32.update(bArr, 0, read);
                j10 -= read;
                if (j10 == 0) {
                    break;
                }
                min = (int) Math.min(16384L, j10);
            }
            long value = crc32.getValue();
            randomAccessFile.close();
            if (value == -1) {
                return value - 1;
            }
            return value;
        } catch (Throwable th2) {
            randomAccessFile.close();
            throw th2;
        }
    }

    public static void v(Context context, long j10, long j11, ArrayList arrayList) {
        SharedPreferences.Editor edit = context.getSharedPreferences("multidex.version", 4).edit();
        edit.putLong("timestamp", j10);
        edit.putLong("crc", j11);
        edit.putInt("dex.number", arrayList.size() + 1);
        Iterator it = arrayList.iterator();
        int i10 = 2;
        while (it.hasNext()) {
            a aVar = (a) it.next();
            edit.putLong("dex.crc." + i10, aVar.f15751a);
            edit.putLong("dex.time." + i10, aVar.lastModified());
            i10++;
        }
        edit.commit();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f15750f.release();
        this.f15749e.close();
        this.f15748d.close();
    }

    public final ArrayList k(Context context, boolean z10) {
        String str;
        ArrayList arrayList;
        boolean z11;
        StringBuilder a10 = android.support.v4.media.d.a("MultiDexExtractor.load(");
        a10.append(this.f15745a.getPath());
        a10.append(", ");
        a10.append(z10);
        a10.append(", ");
        a10.append("");
        a10.append(")");
        Log.i("MultiDex", a10.toString());
        if (this.f15750f.isValid()) {
            if (!z10) {
                File file = this.f15745a;
                long j10 = this.f15746b;
                SharedPreferences sharedPreferences = context.getSharedPreferences("multidex.version", 4);
                if (sharedPreferences.getLong("timestamp", -1L) == h(file) && sharedPreferences.getLong("crc", -1L) == j10) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (!z11) {
                    try {
                        arrayList = q(context);
                    } catch (IOException e10) {
                        Log.w("MultiDex", "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", e10);
                    }
                    StringBuilder a11 = android.support.v4.media.d.a("load found ");
                    a11.append(arrayList.size());
                    a11.append(" secondary dex files");
                    Log.i("MultiDex", a11.toString());
                    return arrayList;
                }
            }
            if (z10) {
                str = "Forced extraction must be performed.";
            } else {
                str = "Detected that extraction must be performed.";
            }
            Log.i("MultiDex", str);
            ArrayList s10 = s();
            v(context, h(this.f15745a), this.f15746b, s10);
            arrayList = s10;
            StringBuilder a112 = android.support.v4.media.d.a("load found ");
            a112.append(arrayList.size());
            a112.append(" secondary dex files");
            Log.i("MultiDex", a112.toString());
            return arrayList;
        }
        throw new IllegalStateException("MultiDexExtractor was closed");
    }

    public final ArrayList q(Context context) {
        d dVar = this;
        Log.i("MultiDex", "loading existing secondary dex files");
        String str = dVar.f15745a.getName() + ".classes";
        SharedPreferences sharedPreferences = context.getSharedPreferences("multidex.version", 4);
        int i10 = sharedPreferences.getInt("dex.number", 1);
        ArrayList arrayList = new ArrayList(i10 - 1);
        int i11 = 2;
        while (i11 <= i10) {
            a aVar = new a(dVar.f15747c, i.a(str, i11, ".zip"));
            if (aVar.isFile()) {
                aVar.f15751a = j(aVar);
                long j10 = sharedPreferences.getLong("dex.crc." + i11, -1L);
                long j11 = sharedPreferences.getLong("dex.time." + i11, -1L);
                long lastModified = aVar.lastModified();
                if (j11 == lastModified) {
                    String str2 = str;
                    if (j10 == aVar.f15751a) {
                        arrayList.add(aVar);
                        i11++;
                        dVar = this;
                        str = str2;
                    }
                }
                throw new IOException("Invalid extracted dex: " + aVar + " (key \"\"), expected modification time: " + j11 + ", modification time: " + lastModified + ", expected crc: " + j10 + ", file crc: " + aVar.f15751a);
            }
            StringBuilder a10 = android.support.v4.media.d.a("Missing extracted secondary dex file '");
            a10.append(aVar.getPath());
            a10.append("'");
            throw new IOException(a10.toString());
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x01bb, code lost:
        throw new java.io.IOException("Could not create zip file " + r8.getAbsolutePath() + " for secondary dex (" + r5 + ")");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList s() {
        /*
            Method dump skipped, instructions count: 463
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.d.s():java.util.ArrayList");
    }
}
