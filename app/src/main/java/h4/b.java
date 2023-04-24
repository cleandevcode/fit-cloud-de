package h4;

/* loaded from: classes.dex */
public enum b {
    AutoCloseSource,
    /* JADX INFO: Fake field, exist only in values array */
    AllowComment,
    AllowUnQuotedFieldNames,
    AllowSingleQuotes,
    InternFieldNames,
    AllowISO8601DateFormat,
    AllowArbitraryCommas,
    UseBigDecimal,
    IgnoreNotMatch,
    SortFeidFastMatch,
    /* JADX INFO: Fake field, exist only in values array */
    DisableASM,
    DisableCircularReferenceDetect,
    InitStringFieldAsEmpty,
    SupportArrayToBean,
    OrderedField,
    DisableSpecialKeyDetect,
    UseObjectArray,
    SupportNonPublicField,
    IgnoreAutoType,
    DisableFieldSmartMatch,
    SupportAutoType,
    NonStringKeyAsString,
    CustomMapDeserializer,
    ErrorOnEnumNotMatch,
    SafeMode,
    TrimStringFieldValue,
    UseNativeJavaObject;
    

    /* renamed from: a */
    public final int f15812a = 1 << ordinal();

    b() {
    }

    public static int a(b[] bVarArr) {
        if (bVarArr == null) {
            return 0;
        }
        int i10 = 0;
        for (b bVar : bVarArr) {
            i10 |= bVar.f15812a;
        }
        return i10;
    }
}
