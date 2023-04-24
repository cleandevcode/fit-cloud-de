package on;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import org.eclipse.paho.android.service.MqttService;
import pn.o;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a */
    public SQLiteDatabase f23655a = null;

    /* renamed from: b */
    public b f23656b;

    /* renamed from: c */
    public MqttService f23657c;

    /* loaded from: classes2.dex */
    public class a implements d {

        /* renamed from: a */
        public String f23658a;

        /* renamed from: b */
        public String f23659b;

        /* renamed from: c */
        public o f23660c;

        public a(String str, String str2, C0423c c0423c) {
            this.f23658a = str;
            this.f23659b = str2;
            this.f23660c = c0423c;
        }

        @Override // on.d
        public final String a() {
            return this.f23658a;
        }

        @Override // on.d
        public final o b() {
            return this.f23660c;
        }

        @Override // on.d
        public final String c() {
            return this.f23659b;
        }
    }

    /* loaded from: classes2.dex */
    public static class b extends SQLiteOpenHelper {

        /* renamed from: a */
        public l f23661a;

        public b(l lVar, Context context) {
            super(context, "mqttAndroidService.db", (SQLiteDatabase.CursorFactory) null, 1);
            this.f23661a = lVar;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            ((MqttService) this.f23661a).g("MQTTDatabaseHelper", "onCreate {CREATE TABLE MqttArrivedMessageTable(messageId TEXT PRIMARY KEY, clientHandle TEXT, destinationName TEXT, payload BLOB, qos INTEGER, retained TEXT, duplicate TEXT, mtimestamp INTEGER);}");
            try {
                sQLiteDatabase.execSQL("CREATE TABLE MqttArrivedMessageTable(messageId TEXT PRIMARY KEY, clientHandle TEXT, destinationName TEXT, payload BLOB, qos INTEGER, retained TEXT, duplicate TEXT, mtimestamp INTEGER);");
                ((MqttService) this.f23661a).g("MQTTDatabaseHelper", "created the table");
            } catch (SQLException e10) {
                ((MqttService) this.f23661a).i("MQTTDatabaseHelper", "onCreate", e10);
                throw e10;
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            ((MqttService) this.f23661a).g("MQTTDatabaseHelper", "onUpgrade");
            try {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS MqttArrivedMessageTable");
                onCreate(sQLiteDatabase);
                ((MqttService) this.f23661a).g("MQTTDatabaseHelper", "onUpgrade complete");
            } catch (SQLException e10) {
                ((MqttService) this.f23661a).i("MQTTDatabaseHelper", "onUpgrade", e10);
                throw e10;
            }
        }
    }

    /* renamed from: on.c$c */
    /* loaded from: classes2.dex */
    public class C0423c extends o {
        public C0423c(byte[] bArr) {
            super(bArr);
        }
    }

    public c(MqttService mqttService, Context context) {
        this.f23656b = null;
        this.f23657c = mqttService;
        this.f23656b = new b(this.f23657c, context);
        this.f23657c.g("DatabaseMessageStore", "DatabaseMessageStore<init> complete");
    }

    public final void a(String str) {
        int delete;
        this.f23655a = this.f23656b.getWritableDatabase();
        String[] strArr = {str};
        if (str == null) {
            this.f23657c.g("DatabaseMessageStore", "clearArrivedMessages: clearing the table");
            delete = this.f23655a.delete("MqttArrivedMessageTable", null, null);
        } else {
            MqttService mqttService = this.f23657c;
            mqttService.g("DatabaseMessageStore", "clearArrivedMessages: clearing the table of " + str + " messages");
            delete = this.f23655a.delete("MqttArrivedMessageTable", "clientHandle=?", strArr);
        }
        MqttService mqttService2 = this.f23657c;
        mqttService2.g("DatabaseMessageStore", "clearArrivedMessages: rows affected = " + delete);
    }

    public final int b(String str) {
        Cursor query = this.f23655a.query("MqttArrivedMessageTable", new String[]{"messageId"}, "clientHandle=?", new String[]{str}, null, null, null);
        int i10 = query.moveToFirst() ? query.getInt(0) : 0;
        query.close();
        return i10;
    }
}
