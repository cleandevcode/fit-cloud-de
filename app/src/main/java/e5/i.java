package e5;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import no.nordicsemi.android.dfu.DfuBaseService;
import r4.j;
import t4.x;

/* loaded from: classes.dex */
public final class i implements j<InputStream, c> {

    /* renamed from: a */
    public final List<ImageHeaderParser> f13480a;

    /* renamed from: b */
    public final j<ByteBuffer, c> f13481b;

    /* renamed from: c */
    public final u4.b f13482c;

    public i(ArrayList arrayList, a aVar, u4.b bVar) {
        this.f13480a = arrayList;
        this.f13481b = aVar;
        this.f13482c = bVar;
    }

    @Override // r4.j
    public final x<c> a(InputStream inputStream, int i10, int i11, r4.h hVar) {
        byte[] bArr;
        InputStream inputStream2 = inputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(DfuBaseService.ERROR_CONNECTION_MASK);
        try {
            byte[] bArr2 = new byte[DfuBaseService.ERROR_CONNECTION_MASK];
            while (true) {
                int read = inputStream2.read(bArr2);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
            byteArrayOutputStream.flush();
            bArr = byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e10);
            }
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        return this.f13481b.a(ByteBuffer.wrap(bArr), i10, i11, hVar);
    }

    @Override // r4.j
    public final boolean b(InputStream inputStream, r4.h hVar) {
        InputStream inputStream2 = inputStream;
        if (!((Boolean) hVar.c(h.f13479b)).booleanValue()) {
            if (com.bumptech.glide.load.a.c(this.f13482c, inputStream2, this.f13480a) == ImageHeaderParser.ImageType.GIF) {
                return true;
            }
        }
        return false;
    }
}
