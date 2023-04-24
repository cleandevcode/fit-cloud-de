package u4;

/* loaded from: classes.dex */
public final class h implements a<int[]> {
    @Override // u4.a
    public final String a() {
        return "IntegerArrayPool";
    }

    @Override // u4.a
    public final int b() {
        return 4;
    }

    @Override // u4.a
    public final int c(int[] iArr) {
        return iArr.length;
    }

    @Override // u4.a
    public final int[] newArray(int i10) {
        return new int[i10];
    }
}
