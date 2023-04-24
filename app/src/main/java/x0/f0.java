package x0;

import android.annotation.NonNull;
import android.annotation.Nullable;
import android.app.Person;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a */
    public CharSequence f30095a;

    /* renamed from: b */
    public IconCompat f30096b;

    /* renamed from: c */
    public String f30097c;

    /* renamed from: d */
    public String f30098d;

    /* renamed from: e */
    public boolean f30099e;

    /* renamed from: f */
    public boolean f30100f;

    /* loaded from: classes.dex */
    public static class a {
        public static f0 a(Person person) {
            IconCompat iconCompat;
            b bVar = new b();
            bVar.f30101a = person.getName();
            if (person.getIcon() != null) {
                Icon icon = person.getIcon();
                PorterDuff.Mode mode = IconCompat.f2190k;
                icon.getClass();
                int c10 = IconCompat.a.c(icon);
                if (c10 != 2) {
                    if (c10 != 4) {
                        if (c10 != 6) {
                            iconCompat = new IconCompat(-1);
                            iconCompat.f2192b = icon;
                        } else {
                            Uri d10 = IconCompat.a.d(icon);
                            d10.getClass();
                            String uri = d10.toString();
                            uri.getClass();
                            iconCompat = new IconCompat(6);
                            iconCompat.f2192b = uri;
                        }
                    } else {
                        Uri d11 = IconCompat.a.d(icon);
                        d11.getClass();
                        String uri2 = d11.toString();
                        uri2.getClass();
                        iconCompat = new IconCompat(4);
                        iconCompat.f2192b = uri2;
                    }
                } else {
                    iconCompat = IconCompat.b(IconCompat.a.b(icon), IconCompat.a.a(icon));
                }
            } else {
                iconCompat = null;
            }
            bVar.f30102b = iconCompat;
            bVar.f30103c = person.getUri();
            bVar.f30104d = person.getKey();
            bVar.f30105e = person.isBot();
            bVar.f30106f = person.isImportant();
            return new f0(bVar);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [android.app.Person$Builder] */
        public static Person b(f0 f0Var) {
            Person.Builder name = new Object() { // from class: android.app.Person.Builder
                static {
                    throw new NoClassDefFoundError();
                }

                @NonNull
                public native /* synthetic */ Person build();

                @NonNull
                public native /* synthetic */ Builder setBot(boolean z10);

                @NonNull
                public native /* synthetic */ Builder setIcon(@Nullable Icon icon);

                @NonNull
                public native /* synthetic */ Builder setImportant(boolean z10);

                @NonNull
                public native /* synthetic */ Builder setKey(@Nullable String str);

                @NonNull
                public native /* synthetic */ Builder setName(@Nullable CharSequence charSequence);

                @NonNull
                public native /* synthetic */ Builder setUri(@Nullable String str);
            }.setName(f0Var.f30095a);
            IconCompat iconCompat = f0Var.f30096b;
            Icon icon = null;
            if (iconCompat != null) {
                if (Build.VERSION.SDK_INT >= 23) {
                    icon = IconCompat.a.f(iconCompat, null);
                } else {
                    throw new UnsupportedOperationException("This method is only supported on API level 23+");
                }
            }
            return name.setIcon(icon).setUri(f0Var.f30097c).setKey(f0Var.f30098d).setBot(f0Var.f30099e).setImportant(f0Var.f30100f).build();
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public CharSequence f30101a;

        /* renamed from: b */
        public IconCompat f30102b;

        /* renamed from: c */
        public String f30103c;

        /* renamed from: d */
        public String f30104d;

        /* renamed from: e */
        public boolean f30105e;

        /* renamed from: f */
        public boolean f30106f;
    }

    public f0(b bVar) {
        this.f30095a = bVar.f30101a;
        this.f30096b = bVar.f30102b;
        this.f30097c = bVar.f30103c;
        this.f30098d = bVar.f30104d;
        this.f30099e = bVar.f30105e;
        this.f30100f = bVar.f30106f;
    }
}
