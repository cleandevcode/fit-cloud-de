package com.sina.weibo.sdk.share;

import android.content.Context;
import android.os.AsyncTask;
import com.sina.weibo.sdk.api.WeiboMultiMessage;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class d extends AsyncTask<WeiboMultiMessage, Void, c> {
    private WeakReference<Context> B;
    private b C;

    public d(Context context, b bVar) {
        this.B = new WeakReference<>(context);
        this.C = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:193:0x012d A[Catch: all -> 0x0189, TryCatch #0 {all -> 0x0189, blocks: (B:128:0x002c, B:130:0x0030, B:132:0x0034, B:133:0x0036, B:135:0x003a, B:137:0x003e, B:139:0x0042, B:140:0x0046, B:142:0x004d, B:143:0x005c, B:145:0x0062, B:147:0x006a, B:149:0x0074, B:151:0x007f, B:153:0x0089, B:158:0x0096, B:160:0x009a, B:161:0x00a1, B:163:0x00ab, B:164:0x00b8, B:165:0x00bf, B:166:0x00c0, B:167:0x00c7, B:168:0x00c8, B:169:0x00cc, B:171:0x00d0, B:173:0x00d4, B:175:0x00de, B:177:0x00e9, B:186:0x011a, B:188:0x0120, B:193:0x012d, B:195:0x0131, B:196:0x0147, B:198:0x015e, B:199:0x0174, B:200:0x017b, B:180:0x00f8, B:182:0x0102, B:185:0x010a, B:201:0x017c, B:202:0x0183, B:203:0x0184), top: B:211:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x005c A[SYNTHETIC] */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.sina.weibo.sdk.share.c doInBackground(com.sina.weibo.sdk.api.WeiboMultiMessage... r13) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sina.weibo.sdk.share.d.doInBackground(com.sina.weibo.sdk.api.WeiboMultiMessage[]):com.sina.weibo.sdk.share.c");
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(c cVar) {
        c cVar2 = cVar;
        super.onPostExecute(cVar2);
        b bVar = this.C;
        if (bVar != null) {
            bVar.a(cVar2);
        }
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
        super.onPreExecute();
    }
}
