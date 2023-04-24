package lj;

import al.i;
import android.content.Context;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.MediaSessionManager;
import android.os.Handler;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import bi.r;
import bl.g;
import fl.w;
import gm.l;
import gm.m;
import i2.t;
import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;
import jh.v;
import jj.o0;
import p000do.a;
import ph.p;
import wi.k;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a */
    public final Context f20045a;

    /* renamed from: b */
    public final wi.a f20046b;

    /* renamed from: c */
    public final jj.d f20047c;

    /* renamed from: d */
    public final MediaSessionManager f20048d;

    /* renamed from: e */
    public MediaControllerCompat f20049e;

    /* renamed from: f */
    public a f20050f;

    /* renamed from: g */
    public i f20051g;

    /* renamed from: h */
    public final d f20052h;

    /* renamed from: i */
    public final f f20053i;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        public final String f20054a;

        /* renamed from: b */
        public final String f20055b;

        /* renamed from: c */
        public final long f20056c;

        public a(String str, long j10, String str2) {
            this.f20054a = str;
            this.f20055b = str2;
            this.f20056c = j10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return l.a(this.f20054a, aVar.f20054a) && l.a(this.f20055b, aVar.f20055b) && this.f20056c == aVar.f20056c;
            }
            return false;
        }

        public final int hashCode() {
            int a10 = t.a(this.f20055b, this.f20054a.hashCode() * 31, 31);
            long j10 = this.f20056c;
            return ((int) (j10 ^ (j10 >>> 32))) + a10;
        }

        public final String toString() {
            StringBuilder c10 = v.c("FcPlaybackInfo(title=");
            c10.append(this.f20054a);
            c10.append(", artist=");
            c10.append(this.f20055b);
            c10.append(", duration=");
            return d4.b.a(c10, this.f20056c, ')');
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a */
        public final int f20057a;

        /* renamed from: b */
        public final long f20058b;

        /* renamed from: c */
        public final float f20059c;

        public b(int i10, long j10, float f10) {
            this.f20057a = i10;
            this.f20058b = j10;
            this.f20059c = f10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.f20057a == bVar.f20057a && this.f20058b == bVar.f20058b && Float.compare(this.f20059c, bVar.f20059c) == 0;
            }
            return false;
        }

        public final int hashCode() {
            long j10 = this.f20058b;
            int i10 = (int) (j10 ^ (j10 >>> 32));
            return Float.floatToIntBits(this.f20059c) + ((i10 + (this.f20057a * 31)) * 31);
        }

        public final String toString() {
            StringBuilder c10 = v.c("FcPlaybackState(state=");
            c10.append(this.f20057a);
            c10.append(", position=");
            c10.append(this.f20058b);
            c10.append(", speed=");
            c10.append(this.f20059c);
            c10.append(')');
            return c10.toString();
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends m implements fm.l<Long, tk.c> {

        /* renamed from: b */
        public final /* synthetic */ b f20060b;

        /* renamed from: c */
        public final /* synthetic */ e f20061c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b bVar, e eVar) {
            super(1);
            this.f20060b = bVar;
            this.f20061c = eVar;
        }

        @Override // fm.l
        public final tk.c k(Long l10) {
            a.b bVar = p000do.a.f13275a;
            bVar.t("Fc#Music");
            StringBuilder c10 = v.c("update state:");
            c10.append(this.f20060b);
            bVar.h(c10.toString(), new Object[0]);
            jj.d dVar = this.f20061c.f20047c;
            b bVar2 = this.f20060b;
            int i10 = bVar2.f20057a;
            long j10 = bVar2.f20058b;
            float f10 = bVar2.f20059c;
            o0 o0Var = (o0) dVar;
            o0Var.getClass();
            byte[] B = r.B((int) j10);
            int i11 = (int) (f10 * 100);
            return h7.a.s(o0Var.f17951a, new bj.b((byte) 2, (byte) -109, new byte[]{(byte) i10, B[0], B[1], B[2], B[3], (byte) ((i11 >> 8) & 255), (byte) (i11 & 255)}));
        }
    }

    public e(Context context, k kVar, o0 o0Var) {
        l.f(context, "context");
        l.f(o0Var, "messageFeature");
        this.f20045a = context;
        this.f20046b = kVar;
        this.f20047c = o0Var;
        Object systemService = context.getSystemService("media_session");
        l.d(systemService, "null cannot be cast to non-null type android.media.session.MediaSessionManager");
        this.f20048d = (MediaSessionManager) systemService;
        this.f20052h = new d(this);
        this.f20053i = new f(this);
    }

    public final void a(MediaController mediaController) {
        MediaSessionCompat.Token token;
        d();
        a.b bVar = p000do.a.f13275a;
        bVar.t("Fc#Music");
        StringBuilder c10 = v.c("update controller:");
        c10.append(mediaController.getPackageName());
        bVar.h(c10.toString(), new Object[0]);
        MediaSession.Token sessionToken = mediaController.getSessionToken();
        MediaMetadataCompat mediaMetadataCompat = null;
        if (sessionToken != null) {
            token = new MediaSessionCompat.Token(sessionToken);
        } else {
            token = null;
        }
        MediaControllerCompat mediaControllerCompat = new MediaControllerCompat(this.f20045a, token);
        f fVar = this.f20053i;
        if (fVar != null) {
            if (mediaControllerCompat.f656b.putIfAbsent(fVar, Boolean.TRUE) != null) {
                Log.w("MediaControllerCompat", "the callback has already been registered");
            } else {
                Handler handler = new Handler();
                fVar.d(handler);
                MediaControllerCompat.MediaControllerImplApi21 mediaControllerImplApi21 = mediaControllerCompat.f655a;
                mediaControllerImplApi21.f657a.registerCallback(fVar.f663a, handler);
                synchronized (mediaControllerImplApi21.f658b) {
                    try {
                        if (mediaControllerImplApi21.f661e.a() != null) {
                            MediaControllerCompat.MediaControllerImplApi21.a aVar = new MediaControllerCompat.MediaControllerImplApi21.a(fVar);
                            mediaControllerImplApi21.f660d.put(fVar, aVar);
                            fVar.f665c = aVar;
                            try {
                                mediaControllerImplApi21.f661e.a().a(aVar);
                                fVar.c(13, null, null);
                            } catch (RemoteException e10) {
                                Log.e("MediaControllerCompat", "Dead object in registerCallback.", e10);
                            }
                        } else {
                            fVar.f665c = null;
                            mediaControllerImplApi21.f659c.add(fVar);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            MediaMetadata metadata = mediaControllerCompat.f655a.f657a.getMetadata();
            if (metadata != null) {
                mediaMetadataCompat = MediaMetadataCompat.a(metadata);
            }
            b(mediaMetadataCompat, false);
            c(mediaControllerCompat.a());
            this.f20049e = mediaControllerCompat;
            return;
        }
        throw new IllegalArgumentException("callback must not be null");
    }

    public final void b(MediaMetadataCompat mediaMetadataCompat, boolean z10) {
        String str;
        wi.d dVar;
        if (mediaMetadataCompat == null) {
            return;
        }
        CharSequence charSequence = mediaMetadataCompat.f652a.getCharSequence("android.media.metadata.TITLE");
        String str2 = null;
        if (charSequence != null) {
            str = charSequence.toString();
        } else {
            str = null;
        }
        String str3 = " ";
        if (str == null) {
            str = " ";
        }
        CharSequence charSequence2 = mediaMetadataCompat.f652a.getCharSequence("android.media.metadata.ARTIST");
        if (charSequence2 != null) {
            str2 = charSequence2.toString();
        }
        if (str2 != null) {
            str3 = str2;
        }
        long j10 = mediaMetadataCompat.f652a.getLong("android.media.metadata.DURATION", 0L);
        a aVar = new a(str, j10, str3);
        if (!l.a(aVar, this.f20050f) || !z10) {
            k kVar = (k) this.f20046b;
            synchronized (kVar) {
                dVar = kVar.f29915w;
            }
            if (dVar == wi.d.CONNECTED) {
                this.f20050f = aVar;
                o0 o0Var = (o0) this.f20047c;
                o0Var.getClass();
                Charset charset = om.a.f23623a;
                byte[] bytes = str.getBytes(charset);
                l.e(bytes, "this as java.lang.String).getBytes(charset)");
                int length = bytes.length;
                if (127 <= length) {
                    length = 127;
                }
                byte[] bytes2 = str3.getBytes(charset);
                l.e(bytes2, "this as java.lang.String).getBytes(charset)");
                int length2 = bytes2.length;
                if (96 <= length2) {
                    length2 = 96;
                }
                int i10 = length + 6;
                byte[] bArr = new byte[i10 + length2];
                bArr[0] = (byte) length;
                bArr[1] = (byte) length2;
                byte[] B = r.B((int) j10);
                bArr[2] = B[0];
                bArr[3] = B[1];
                bArr[4] = B[2];
                bArr[5] = B[3];
                System.arraycopy(bytes, 0, bArr, 6, length);
                System.arraycopy(bytes2, 0, bArr, i10, length2);
                new g(h7.a.s(o0Var.f17951a, new bj.b((byte) 2, (byte) -108, bArr))).f();
                a.b bVar = p000do.a.f13275a;
                bVar.t("Fc#Music");
                bVar.h("update info:" + aVar, new Object[0]);
            }
        }
    }

    public final void c(PlaybackStateCompat playbackStateCompat) {
        b bVar;
        wi.d dVar;
        i iVar = this.f20051g;
        if (iVar != null) {
            xk.b.a(iVar);
        }
        int i10 = 0;
        if (playbackStateCompat == null) {
            bVar = new b(0, 0L, 0.0f);
        } else {
            int i11 = playbackStateCompat.f682a;
            if (i11 != 0 && i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        return;
                    }
                    i10 = 1;
                } else {
                    i10 = 2;
                }
            }
            bVar = new b(i10, playbackStateCompat.f683b, playbackStateCompat.f685d);
        }
        k kVar = (k) this.f20046b;
        synchronized (kVar) {
            dVar = kVar.f29915w;
        }
        if (dVar == wi.d.CONNECTED) {
            this.f20051g = new g(new w(tk.i.D(750L, TimeUnit.MILLISECONDS), new p(8, new c(bVar, this)))).f();
        }
    }

    public final void d() {
        String str;
        a.b bVar = p000do.a.f13275a;
        bVar.t("Fc#Music");
        StringBuilder c10 = v.c("release controller:");
        MediaControllerCompat mediaControllerCompat = this.f20049e;
        if (mediaControllerCompat != null) {
            str = mediaControllerCompat.f655a.f657a.getPackageName();
        } else {
            str = null;
        }
        c10.append(str);
        bVar.h(c10.toString(), new Object[0]);
        MediaControllerCompat mediaControllerCompat2 = this.f20049e;
        if (mediaControllerCompat2 != null) {
            c(null);
            try {
                mediaControllerCompat2.b(this.f20053i);
            } catch (Exception e10) {
                a.b bVar2 = p000do.a.f13275a;
                bVar2.t("Fc#Music");
                bVar2.q(e10);
            }
        }
        this.f20049e = null;
        this.f20050f = null;
    }
}
