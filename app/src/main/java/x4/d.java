package x4;

import android.util.Base64;
import com.bumptech.glide.load.data.d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import x4.n;

/* loaded from: classes.dex */
public final class d<Model, Data> implements n<Model, Data> {

    /* renamed from: a */
    public final a<Data> f30202a;

    /* loaded from: classes.dex */
    public interface a<Data> {
    }

    /* loaded from: classes.dex */
    public static final class b<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: a */
        public final String f30203a;

        /* renamed from: b */
        public final a<Data> f30204b;

        /* renamed from: c */
        public ByteArrayInputStream f30205c;

        public b(String str, a<Data> aVar) {
            this.f30203a = str;
            this.f30204b = aVar;
        }

        @Override // com.bumptech.glide.load.data.d
        public final Class<Data> a() {
            ((c.a) this.f30204b).getClass();
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.d
        public final void b() {
            try {
                a<Data> aVar = this.f30204b;
                ByteArrayInputStream byteArrayInputStream = this.f30205c;
                ((c.a) aVar).getClass();
                byteArrayInputStream.close();
            } catch (IOException unused) {
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public final r4.a d() {
            return r4.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public final void e(com.bumptech.glide.j jVar, d.a<? super Data> aVar) {
            try {
                ByteArrayInputStream a10 = ((c.a) this.f30204b).a(this.f30203a);
                this.f30205c = a10;
                aVar.f(a10);
            } catch (IllegalArgumentException e10) {
                aVar.c(e10);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class c<Model> implements o<Model, InputStream> {

        /* renamed from: a */
        public final a f30206a = new a();

        /* loaded from: classes.dex */
        public class a implements a<InputStream> {
            public final ByteArrayInputStream a(String str) {
                if (str.startsWith("data:image")) {
                    int indexOf = str.indexOf(44);
                    if (indexOf != -1) {
                        if (str.substring(0, indexOf).endsWith(";base64")) {
                            return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                        }
                        throw new IllegalArgumentException("Not a base64 image data URL.");
                    }
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                throw new IllegalArgumentException("Not a valid image data URL.");
            }
        }

        @Override // x4.o
        public final n<Model, InputStream> b(r rVar) {
            return new d(this.f30206a);
        }
    }

    public d(c.a aVar) {
        this.f30202a = aVar;
    }

    @Override // x4.n
    public final boolean a(Model model) {
        return model.toString().startsWith("data:image");
    }

    @Override // x4.n
    public final n.a<Data> b(Model model, int i10, int i11, r4.h hVar) {
        return new n.a<>(new l5.b(model), new b(model.toString(), this.f30202a));
    }
}
