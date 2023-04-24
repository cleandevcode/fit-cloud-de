package com.sina.weibo.sdk.net;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes.dex */
public final class g implements f {
    private int code;

    /* renamed from: p */
    private InputStream f9518p;

    public g(int i10, InputStream inputStream) {
        this.code = i10;
        this.f9518p = inputStream;
    }

    @Override // com.sina.weibo.sdk.net.f
    public final String f() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED];
            while (true) {
                int read = this.f9518p.read(bArr);
                if (read == -1) {
                    String byteArrayOutputStream2 = byteArrayOutputStream.toString();
                    byteArrayOutputStream.close();
                    return byteArrayOutputStream2;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (IOException e10) {
            throw e10;
        }
    }
}
