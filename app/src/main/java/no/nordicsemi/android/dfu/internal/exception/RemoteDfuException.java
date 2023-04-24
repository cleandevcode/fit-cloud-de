package no.nordicsemi.android.dfu.internal.exception;

import a0.q;

/* loaded from: classes2.dex */
public class RemoteDfuException extends Exception {
    private static final long serialVersionUID = -6901728550661937942L;
    private final int mState;

    public RemoteDfuException(String str, int i10) {
        super(str);
        this.mState = i10;
    }

    public int getErrorNumber() {
        return this.mState;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.getMessage());
        sb2.append(" (error ");
        return q.b(sb2, this.mState, ")");
    }
}
