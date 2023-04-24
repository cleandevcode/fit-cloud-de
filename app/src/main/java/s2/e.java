package s2;

import android.database.sqlite.SQLiteStatement;
import r2.f;

/* loaded from: classes.dex */
public final class e extends d implements f {

    /* renamed from: b */
    public final SQLiteStatement f26552b;

    public e(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f26552b = sQLiteStatement;
    }

    @Override // r2.f
    public final long F0() {
        return this.f26552b.executeInsert();
    }

    @Override // r2.f
    public final int r() {
        return this.f26552b.executeUpdateDelete();
    }
}
