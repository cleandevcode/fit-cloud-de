package lj;

import android.media.session.MediaSessionManager;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements MediaSessionManager.OnActiveSessionsChangedListener {

    /* renamed from: a */
    public final /* synthetic */ e f20044a;

    public /* synthetic */ d(e eVar) {
        this.f20044a = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0038 A[Catch: Exception -> 0x0087, TryCatch #0 {Exception -> 0x0087, blocks: (B:49:0x002c, B:55:0x0038, B:56:0x003c, B:58:0x0040, B:61:0x0059, B:63:0x0062, B:64:0x0066, B:66:0x006c, B:68:0x0078, B:73:0x0083, B:76:0x0089), top: B:80:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x003c A[Catch: Exception -> 0x0087, TryCatch #0 {Exception -> 0x0087, blocks: (B:49:0x002c, B:55:0x0038, B:56:0x003c, B:58:0x0040, B:61:0x0059, B:63:0x0062, B:64:0x0066, B:66:0x006c, B:68:0x0078, B:73:0x0083, B:76:0x0089), top: B:80:0x002c }] */
    @Override // android.media.session.MediaSessionManager.OnActiveSessionsChangedListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onActiveSessionsChanged(java.util.List r8) {
        /*
            r7 = this;
            lj.e r0 = r7.f20044a
            java.lang.String r1 = "this$0"
            gm.l.f(r0, r1)
            do.a$b r1 = p000do.a.f13275a
            java.lang.String r2 = "Fc#Music"
            r1.t(r2)
            java.lang.String r3 = "onActiveSessionsChanged thread:"
            java.lang.StringBuilder r3 = jh.v.c(r3)
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            java.lang.String r4 = r4.getName()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = 0
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r1.h(r3, r5)
            r1 = 1
            if (r8 == 0) goto L35
            boolean r3 = r8.isEmpty()     // Catch: java.lang.Exception -> L87
            if (r3 == 0) goto L33
            goto L35
        L33:
            r3 = 0
            goto L36
        L35:
            r3 = 1
        L36:
            if (r3 == 0) goto L3c
            r0.d()     // Catch: java.lang.Exception -> L87
            goto La0
        L3c:
            android.support.v4.media.session.MediaControllerCompat r3 = r0.f20049e     // Catch: java.lang.Exception -> L87
            if (r3 == 0) goto L89
            android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21 r5 = r3.f655a     // Catch: java.lang.Exception -> L87
            android.media.session.MediaController r5 = r5.f657a     // Catch: java.lang.Exception -> L87
            java.lang.String r5 = r5.getPackageName()     // Catch: java.lang.Exception -> L87
            java.lang.Object r6 = r8.get(r4)     // Catch: java.lang.Exception -> L87
            android.media.session.MediaController r6 = (android.media.session.MediaController) r6     // Catch: java.lang.Exception -> L87
            java.lang.String r6 = r6.getPackageName()     // Catch: java.lang.Exception -> L87
            boolean r5 = gm.l.a(r5, r6)     // Catch: java.lang.Exception -> L87
            if (r5 != 0) goto L59
            goto L89
        L59:
            android.support.v4.media.session.PlaybackStateCompat r3 = r3.a()     // Catch: java.lang.Exception -> L87
            int r3 = r3.f682a     // Catch: java.lang.Exception -> L87
            r5 = 3
            if (r3 == r5) goto La0
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Exception -> L87
        L66:
            boolean r3 = r8.hasNext()     // Catch: java.lang.Exception -> L87
            if (r3 == 0) goto La0
            java.lang.Object r3 = r8.next()     // Catch: java.lang.Exception -> L87
            android.media.session.MediaController r3 = (android.media.session.MediaController) r3     // Catch: java.lang.Exception -> L87
            android.media.session.PlaybackState r6 = r3.getPlaybackState()     // Catch: java.lang.Exception -> L87
            if (r6 == 0) goto L80
            int r6 = r6.getState()     // Catch: java.lang.Exception -> L87
            if (r6 != r5) goto L80
            r6 = 1
            goto L81
        L80:
            r6 = 0
        L81:
            if (r6 == 0) goto L66
            r0.a(r3)     // Catch: java.lang.Exception -> L87
            goto L66
        L87:
            r8 = move-exception
            goto L98
        L89:
            java.lang.Object r8 = r8.get(r4)     // Catch: java.lang.Exception -> L87
            java.lang.String r1 = "controllers[0]"
            gm.l.e(r8, r1)     // Catch: java.lang.Exception -> L87
            android.media.session.MediaController r8 = (android.media.session.MediaController) r8     // Catch: java.lang.Exception -> L87
            r0.a(r8)     // Catch: java.lang.Exception -> L87
            goto La0
        L98:
            do.a$b r0 = p000do.a.f13275a
            r0.t(r2)
            r0.q(r8)
        La0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lj.d.onActiveSessionsChanged(java.util.List):void");
    }
}
