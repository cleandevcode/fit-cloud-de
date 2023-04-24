package on;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.Iterator;
import on.c;

/* loaded from: classes2.dex */
public final class b implements Iterator<d> {

    /* renamed from: a */
    public Cursor f23653a;

    /* renamed from: b */
    public boolean f23654b;

    public b(c cVar, String str) {
        Cursor query;
        String[] strArr = {str};
        SQLiteDatabase writableDatabase = cVar.f23656b.getWritableDatabase();
        cVar.f23655a = writableDatabase;
        if (str == null) {
            query = writableDatabase.query("MqttArrivedMessageTable", null, null, null, null, null, "mtimestamp ASC");
        } else {
            query = writableDatabase.query("MqttArrivedMessageTable", null, "clientHandle=?", strArr, null, null, "mtimestamp ASC");
        }
        this.f23653a = query;
        this.f23654b = query.moveToFirst();
    }

    public final void finalize() {
        this.f23653a.close();
        super.finalize();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f23654b) {
            this.f23653a.close();
        }
        return this.f23654b;
    }

    @Override // java.util.Iterator
    public final d next() {
        Cursor cursor = this.f23653a;
        String string = cursor.getString(cursor.getColumnIndex("messageId"));
        Cursor cursor2 = this.f23653a;
        cursor2.getString(cursor2.getColumnIndex("clientHandle"));
        Cursor cursor3 = this.f23653a;
        String string2 = cursor3.getString(cursor3.getColumnIndex("destinationName"));
        Cursor cursor4 = this.f23653a;
        byte[] blob = cursor4.getBlob(cursor4.getColumnIndex("payload"));
        Cursor cursor5 = this.f23653a;
        int i10 = cursor5.getInt(cursor5.getColumnIndex("qos"));
        Cursor cursor6 = this.f23653a;
        boolean parseBoolean = Boolean.parseBoolean(cursor6.getString(cursor6.getColumnIndex("retained")));
        Cursor cursor7 = this.f23653a;
        boolean parseBoolean2 = Boolean.parseBoolean(cursor7.getString(cursor7.getColumnIndex("duplicate")));
        c.C0423c c0423c = new c.C0423c(blob);
        c0423c.a(i10);
        if (c0423c.f24446a) {
            c0423c.f24449d = parseBoolean;
            c0423c.f24450e = parseBoolean2;
            this.f23654b = this.f23653a.moveToNext();
            return new c.a(string, string2, c0423c);
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
