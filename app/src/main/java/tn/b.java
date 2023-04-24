package tn;

/* loaded from: classes2.dex */
public abstract class b extends u {
    public b(byte b10) {
        super(b10);
    }

    @Override // tn.u
    public final byte n() {
        return (byte) 0;
    }

    @Override // tn.u
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(String.valueOf(super.toString()));
        stringBuffer.append(" msgId ");
        stringBuffer.append(this.f28412b);
        return stringBuffer.toString();
    }
}
