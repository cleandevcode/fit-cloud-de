package zn;

/* loaded from: classes2.dex */
public final class g implements d {
    public final String a(String str) {
        return (str.startsWith("lib") && str.endsWith(".so")) ? str : System.mapLibraryName(str);
    }
}
