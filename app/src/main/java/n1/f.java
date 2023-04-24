package n1;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a */
    public final c f21925a;

    /* loaded from: classes.dex */
    public static final class a implements c {

        /* renamed from: a */
        public final InputContentInfo f21926a;

        public a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f21926a = new InputContentInfo(uri, clipDescription, uri2);
        }

        public a(Object obj) {
            this.f21926a = (InputContentInfo) obj;
        }

        @Override // n1.f.c
        public final void a() {
            this.f21926a.requestPermission();
        }

        @Override // n1.f.c
        public final Uri b() {
            return this.f21926a.getContentUri();
        }

        @Override // n1.f.c
        public final Uri c() {
            return this.f21926a.getLinkUri();
        }

        @Override // n1.f.c
        public final ClipDescription d() {
            return this.f21926a.getDescription();
        }

        @Override // n1.f.c
        public final Object e() {
            return this.f21926a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements c {

        /* renamed from: a */
        public final Uri f21927a;

        /* renamed from: b */
        public final ClipDescription f21928b;

        /* renamed from: c */
        public final Uri f21929c;

        public b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f21927a = uri;
            this.f21928b = clipDescription;
            this.f21929c = uri2;
        }

        @Override // n1.f.c
        public final void a() {
        }

        @Override // n1.f.c
        public final Uri b() {
            return this.f21927a;
        }

        @Override // n1.f.c
        public final Uri c() {
            return this.f21929c;
        }

        @Override // n1.f.c
        public final ClipDescription d() {
            return this.f21928b;
        }

        @Override // n1.f.c
        public final Object e() {
            return null;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a();

        Uri b();

        Uri c();

        ClipDescription d();

        Object e();
    }

    public f(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f21925a = Build.VERSION.SDK_INT >= 25 ? new a(uri, clipDescription, uri2) : new b(uri, clipDescription, uri2);
    }

    public f(a aVar) {
        this.f21925a = aVar;
    }
}
