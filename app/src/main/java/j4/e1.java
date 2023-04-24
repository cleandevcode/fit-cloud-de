package j4;

/* loaded from: classes.dex */
public enum e1 {
    QuoteFieldNames,
    UseSingleQuotes,
    WriteMapNullValue,
    WriteEnumUsingToString,
    WriteEnumUsingName,
    UseISO8601DateFormat,
    WriteNullListAsEmpty,
    WriteNullStringAsEmpty,
    WriteNullNumberAsZero,
    WriteNullBooleanAsFalse,
    SkipTransientField,
    SortField,
    /* JADX INFO: Fake field, exist only in values array */
    WriteTabAsSpecial,
    PrettyFormat,
    WriteClassName,
    DisableCircularReferenceDetect,
    WriteSlashAsSpecial,
    BrowserCompatible,
    WriteDateUseDateFormat,
    NotWriteRootClassName,
    /* JADX INFO: Fake field, exist only in values array */
    DisableCheckSpecialChar,
    BeanToArray,
    WriteNonStringKeyAsString,
    NotWriteDefaultValue,
    BrowserSecure,
    IgnoreNonFieldGetter,
    WriteNonStringValueAsString,
    IgnoreErrorGetter,
    WriteBigDecimalAsPlain,
    MapSortField;
    
    public static final e1[] D;
    public static final int E;

    /* renamed from: a */
    public final int f17396a = 1 << ordinal();

    static {
        e1 e1Var = WriteMapNullValue;
        e1 e1Var2 = WriteNullListAsEmpty;
        e1 e1Var3 = WriteNullStringAsEmpty;
        e1 e1Var4 = WriteNullNumberAsZero;
        e1 e1Var5 = WriteNullBooleanAsFalse;
        D = new e1[0];
        E = e1Var.f17396a | e1Var5.f17396a | e1Var2.f17396a | e1Var4.f17396a | e1Var3.f17396a;
    }

    e1() {
    }

    public static boolean c(int i10, int i11, e1 e1Var) {
        int i12 = e1Var.f17396a;
        return ((i10 & i12) == 0 && (i11 & i12) == 0) ? false : true;
    }

    public static boolean d(int i10, e1 e1Var) {
        return (i10 & e1Var.f17396a) != 0;
    }

    public static int e(e1[] e1VarArr) {
        if (e1VarArr == null) {
            return 0;
        }
        int i10 = 0;
        for (e1 e1Var : e1VarArr) {
            i10 |= e1Var.f17396a;
        }
        return i10;
    }

    public final int a() {
        return this.f17396a;
    }
}
