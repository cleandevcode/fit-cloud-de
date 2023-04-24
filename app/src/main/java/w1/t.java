package w1;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: b */
    public static final t f29703b;

    /* renamed from: c */
    public static final t f29704c;

    /* renamed from: d */
    public static final t[] f29705d;

    /* renamed from: e */
    public static final /* synthetic */ t[] f29706e;

    /* renamed from: a */
    public final int f29707a;
    t EF6;

    static {
        a0 a0Var = a0.DOUBLE;
        t tVar = new t("DOUBLE", 0, 0, 1, a0Var);
        a0 a0Var2 = a0.FLOAT;
        t tVar2 = new t("FLOAT", 1, 1, 1, a0Var2);
        a0 a0Var3 = a0.LONG;
        t tVar3 = new t("INT64", 2, 2, 1, a0Var3);
        t tVar4 = new t("UINT64", 3, 3, 1, a0Var3);
        a0 a0Var4 = a0.INT;
        t tVar5 = new t("INT32", 4, 4, 1, a0Var4);
        t tVar6 = new t("FIXED64", 5, 5, 1, a0Var3);
        t tVar7 = new t("FIXED32", 6, 6, 1, a0Var4);
        a0 a0Var5 = a0.BOOLEAN;
        t tVar8 = new t("BOOL", 7, 7, 1, a0Var5);
        a0 a0Var6 = a0.STRING;
        t tVar9 = new t("STRING", 8, 8, 1, a0Var6);
        a0 a0Var7 = a0.MESSAGE;
        t tVar10 = new t("MESSAGE", 9, 9, 1, a0Var7);
        a0 a0Var8 = a0.BYTE_STRING;
        t tVar11 = new t("BYTES", 10, 10, 1, a0Var8);
        t tVar12 = new t("UINT32", 11, 11, 1, a0Var4);
        a0 a0Var9 = a0.ENUM;
        t tVar13 = new t("ENUM", 12, 12, 1, a0Var9);
        t tVar14 = new t("SFIXED32", 13, 13, 1, a0Var4);
        t tVar15 = new t("SFIXED64", 14, 14, 1, a0Var3);
        t tVar16 = new t("SINT32", 15, 15, 1, a0Var4);
        t tVar17 = new t("SINT64", 16, 16, 1, a0Var3);
        t tVar18 = new t("GROUP", 17, 17, 1, a0Var7);
        t tVar19 = new t("DOUBLE_LIST", 18, 18, 2, a0Var);
        t tVar20 = new t("FLOAT_LIST", 19, 19, 2, a0Var2);
        t tVar21 = new t("INT64_LIST", 20, 20, 2, a0Var3);
        t tVar22 = new t("UINT64_LIST", 21, 21, 2, a0Var3);
        t tVar23 = new t("INT32_LIST", 22, 22, 2, a0Var4);
        t tVar24 = new t("FIXED64_LIST", 23, 23, 2, a0Var3);
        t tVar25 = new t("FIXED32_LIST", 24, 24, 2, a0Var4);
        t tVar26 = new t("BOOL_LIST", 25, 25, 2, a0Var5);
        t tVar27 = new t("STRING_LIST", 26, 26, 2, a0Var6);
        t tVar28 = new t("MESSAGE_LIST", 27, 27, 2, a0Var7);
        t tVar29 = new t("BYTES_LIST", 28, 28, 2, a0Var8);
        t tVar30 = new t("UINT32_LIST", 29, 29, 2, a0Var4);
        t tVar31 = new t("ENUM_LIST", 30, 30, 2, a0Var9);
        t tVar32 = new t("SFIXED32_LIST", 31, 31, 2, a0Var4);
        t tVar33 = new t("SFIXED64_LIST", 32, 32, 2, a0Var3);
        t tVar34 = new t("SINT32_LIST", 33, 33, 2, a0Var4);
        t tVar35 = new t("SINT64_LIST", 34, 34, 2, a0Var3);
        t tVar36 = new t("DOUBLE_LIST_PACKED", 35, 35, 3, a0Var);
        f29703b = tVar36;
        t tVar37 = new t("FLOAT_LIST_PACKED", 36, 36, 3, a0Var2);
        t tVar38 = new t("INT64_LIST_PACKED", 37, 37, 3, a0Var3);
        t tVar39 = new t("UINT64_LIST_PACKED", 38, 38, 3, a0Var3);
        t tVar40 = new t("INT32_LIST_PACKED", 39, 39, 3, a0Var4);
        t tVar41 = new t("FIXED64_LIST_PACKED", 40, 40, 3, a0Var3);
        t tVar42 = new t("FIXED32_LIST_PACKED", 41, 41, 3, a0Var4);
        t tVar43 = new t("BOOL_LIST_PACKED", 42, 42, 3, a0Var5);
        t tVar44 = new t("UINT32_LIST_PACKED", 43, 43, 3, a0Var4);
        t tVar45 = new t("ENUM_LIST_PACKED", 44, 44, 3, a0Var9);
        t tVar46 = new t("SFIXED32_LIST_PACKED", 45, 45, 3, a0Var4);
        t tVar47 = new t("SFIXED64_LIST_PACKED", 46, 46, 3, a0Var3);
        t tVar48 = new t("SINT32_LIST_PACKED", 47, 47, 3, a0Var4);
        t tVar49 = new t("SINT64_LIST_PACKED", 48, 48, 3, a0Var3);
        f29704c = tVar49;
        f29706e = new t[]{tVar, tVar2, tVar3, tVar4, tVar5, tVar6, tVar7, tVar8, tVar9, tVar10, tVar11, tVar12, tVar13, tVar14, tVar15, tVar16, tVar17, tVar18, tVar19, tVar20, tVar21, tVar22, tVar23, tVar24, tVar25, tVar26, tVar27, tVar28, tVar29, tVar30, tVar31, tVar32, tVar33, tVar34, tVar35, tVar36, tVar37, tVar38, tVar39, tVar40, tVar41, tVar42, tVar43, tVar44, tVar45, tVar46, tVar47, tVar48, tVar49, new t("GROUP_LIST", 49, 49, 2, a0Var7), new t("MAP", 50, 50, 4, a0.VOID)};
        t[] values = values();
        f29705d = new t[values.length];
        for (t tVar50 : values) {
            f29705d[tVar50.f29707a] = tVar50;
        }
    }

    public t(String str, int i10, int i11, int i12, a0 a0Var) {
        super(str, i10);
        this.f29707a = i11;
        if (i12 == 0) {
            throw null;
        }
        int i13 = i12 - 1;
        if (i13 == 1 || i13 == 3) {
            a0Var.getClass();
        }
        if (i12 == 1) {
            a0Var.ordinal();
        }
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) f29706e.clone();
    }

    public final int a() {
        return this.f29707a;
    }
}
