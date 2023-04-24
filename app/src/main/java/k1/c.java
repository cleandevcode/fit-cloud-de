package k1;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    public final e f18095a;

    /* loaded from: classes.dex */
    public static final class a implements b {

        /* renamed from: a */
        public final ContentInfo.Builder f18096a;

        public a(ClipData clipData, int i10) {
            this.f18096a = new ContentInfo.Builder(clipData, i10);
        }

        @Override // k1.c.b
        public final void a(Uri uri) {
            this.f18096a.setLinkUri(uri);
        }

        @Override // k1.c.b
        public final void b(int i10) {
            this.f18096a.setFlags(i10);
        }

        @Override // k1.c.b
        public final c build() {
            return new c(new d(this.f18096a.build()));
        }

        @Override // k1.c.b
        public final void setExtras(Bundle bundle) {
            this.f18096a.setExtras(bundle);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(Uri uri);

        void b(int i10);

        c build();

        void setExtras(Bundle bundle);
    }

    /* renamed from: k1.c$c */
    /* loaded from: classes.dex */
    public static final class C0314c implements b {

        /* renamed from: a */
        public ClipData f18097a;

        /* renamed from: b */
        public int f18098b;

        /* renamed from: c */
        public int f18099c;

        /* renamed from: d */
        public Uri f18100d;

        /* renamed from: e */
        public Bundle f18101e;

        public C0314c(ClipData clipData, int i10) {
            this.f18097a = clipData;
            this.f18098b = i10;
        }

        @Override // k1.c.b
        public final void a(Uri uri) {
            this.f18100d = uri;
        }

        @Override // k1.c.b
        public final void b(int i10) {
            this.f18099c = i10;
        }

        @Override // k1.c.b
        public final c build() {
            return new c(new f(this));
        }

        @Override // k1.c.b
        public final void setExtras(Bundle bundle) {
            this.f18101e = bundle;
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements e {

        /* renamed from: a */
        public final ContentInfo f18102a;

        public d(ContentInfo contentInfo) {
            contentInfo.getClass();
            this.f18102a = contentInfo;
        }

        @Override // k1.c.e
        public final ClipData a() {
            return this.f18102a.getClip();
        }

        @Override // k1.c.e
        public final int b() {
            return this.f18102a.getFlags();
        }

        @Override // k1.c.e
        public final ContentInfo c() {
            return this.f18102a;
        }

        @Override // k1.c.e
        public final int d() {
            return this.f18102a.getSource();
        }

        public final String toString() {
            StringBuilder a10 = android.support.v4.media.d.a("ContentInfoCompat{");
            a10.append(this.f18102a);
            a10.append("}");
            return a10.toString();
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        ClipData a();

        int b();

        ContentInfo c();

        int d();
    }

    /* loaded from: classes.dex */
    public static final class f implements e {

        /* renamed from: a */
        public final ClipData f18103a;

        /* renamed from: b */
        public final int f18104b;

        /* renamed from: c */
        public final int f18105c;

        /* renamed from: d */
        public final Uri f18106d;

        /* renamed from: e */
        public final Bundle f18107e;

        public f(C0314c c0314c) {
            ClipData clipData = c0314c.f18097a;
            clipData.getClass();
            this.f18103a = clipData;
            int i10 = c0314c.f18098b;
            s.h1.g(i10, "source", 0, 5);
            this.f18104b = i10;
            int i11 = c0314c.f18099c;
            if ((i11 & 1) == i11) {
                this.f18105c = i11;
                this.f18106d = c0314c.f18100d;
                this.f18107e = c0314c.f18101e;
                return;
            }
            StringBuilder a10 = android.support.v4.media.d.a("Requested flags 0x");
            a10.append(Integer.toHexString(i11));
            a10.append(", but only 0x");
            a10.append(Integer.toHexString(1));
            a10.append(" are allowed");
            throw new IllegalArgumentException(a10.toString());
        }

        @Override // k1.c.e
        public final ClipData a() {
            return this.f18103a;
        }

        @Override // k1.c.e
        public final int b() {
            return this.f18105c;
        }

        @Override // k1.c.e
        public final ContentInfo c() {
            return null;
        }

        @Override // k1.c.e
        public final int d() {
            return this.f18104b;
        }

        public final String toString() {
            String str;
            String valueOf;
            String sb2;
            StringBuilder a10 = android.support.v4.media.d.a("ContentInfoCompat{clip=");
            a10.append(this.f18103a.getDescription());
            a10.append(", source=");
            int i10 = this.f18104b;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                if (i10 != 5) {
                                    str = String.valueOf(i10);
                                } else {
                                    str = "SOURCE_PROCESS_TEXT";
                                }
                            } else {
                                str = "SOURCE_AUTOFILL";
                            }
                        } else {
                            str = "SOURCE_DRAG_AND_DROP";
                        }
                    } else {
                        str = "SOURCE_INPUT_METHOD";
                    }
                } else {
                    str = "SOURCE_CLIPBOARD";
                }
            } else {
                str = "SOURCE_APP";
            }
            a10.append(str);
            a10.append(", flags=");
            int i11 = this.f18105c;
            if ((i11 & 1) != 0) {
                valueOf = "FLAG_CONVERT_TO_PLAIN_TEXT";
            } else {
                valueOf = String.valueOf(i11);
            }
            a10.append(valueOf);
            String str2 = "";
            if (this.f18106d == null) {
                sb2 = "";
            } else {
                StringBuilder a11 = android.support.v4.media.d.a(", hasLinkUri(");
                a11.append(this.f18106d.toString().length());
                a11.append(")");
                sb2 = a11.toString();
            }
            a10.append(sb2);
            if (this.f18107e != null) {
                str2 = ", hasExtras";
            }
            return androidx.activity.e.b(a10, str2, "}");
        }
    }

    public c(e eVar) {
        this.f18095a = eVar;
    }

    public final String toString() {
        return this.f18095a.toString();
    }
}
