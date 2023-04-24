package sn;

import java.util.prefs.AbstractPreferences;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a */
    public static final C0490a f27363a = new C0490a();

    /* renamed from: sn.a$a */
    /* loaded from: classes2.dex */
    public class C0490a extends AbstractPreferences {

        /* renamed from: a */
        public String f27364a;

        public C0490a() {
            super(null, "");
            this.f27364a = null;
        }

        @Override // java.util.prefs.AbstractPreferences
        public final AbstractPreferences childSpi(String str) {
            return null;
        }

        @Override // java.util.prefs.AbstractPreferences
        public final String[] childrenNamesSpi() {
            return null;
        }

        @Override // java.util.prefs.AbstractPreferences
        public final void flushSpi() {
        }

        @Override // java.util.prefs.AbstractPreferences
        public final String getSpi(String str) {
            return null;
        }

        @Override // java.util.prefs.AbstractPreferences
        public final String[] keysSpi() {
            return null;
        }

        @Override // java.util.prefs.AbstractPreferences
        public final void putSpi(String str, String str2) {
            this.f27364a = str2;
        }

        @Override // java.util.prefs.AbstractPreferences
        public final void removeNodeSpi() {
        }

        @Override // java.util.prefs.AbstractPreferences
        public final void removeSpi(String str) {
        }

        @Override // java.util.prefs.AbstractPreferences
        public final void syncSpi() {
        }
    }
}
