package com.mob.commons.cc;

import java.util.ArrayList;
import java.util.LinkedList;

/* loaded from: classes.dex */
public class y {

    /* renamed from: a */
    private String f8354a;

    /* renamed from: b */
    private int f8355b;

    /* renamed from: c */
    private r f8356c;

    /* renamed from: d */
    private int f8357d;

    /* renamed from: e */
    private int f8358e;

    /* renamed from: f */
    private v f8359f;

    /* loaded from: classes.dex */
    public static class a implements s<a> {

        /* renamed from: a */
        public Throwable f8360a;

        /* renamed from: b */
        public Object f8361b;

        public boolean a() {
            return this.f8360a != null;
        }

        @Override // com.mob.commons.cc.s
        public boolean a(a aVar, Class<a> cls, String str, Object[] objArr, boolean[] zArr, Object[] objArr2, Throwable[] thArr) {
            if ("isError".equals(str) && objArr.length == 0) {
                objArr2[0] = Boolean.valueOf(aVar.a());
                return true;
            } else if ("getError".equals(str) && objArr.length == 0) {
                objArr2[0] = aVar.f8360a;
                return true;
            } else if ("getResult".equals(str) && objArr.length == 0) {
                objArr2[0] = aVar.f8361b;
                return true;
            } else {
                return false;
            }
        }
    }

    public y(String str, int i10, ArrayList<x> arrayList, ArrayList<Object> arrayList2, int i11, int i12, r rVar) {
        this.f8354a = str;
        this.f8355b = i10;
        this.f8359f = new v(arrayList, arrayList2);
        this.f8357d = i11;
        this.f8358e = i12;
        this.f8356c = rVar;
    }

    public static y a(String str, int i10, ArrayList<x> arrayList, ArrayList<Object> arrayList2, int i11, int i12, r rVar) {
        return new y(str, i10, arrayList, arrayList2, i11, i12, rVar) { // from class: com.mob.commons.cc.y.1
            @Override // com.mob.commons.cc.y
            public LinkedList<Object> b(Object... objArr) {
                return new LinkedList<>();
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(java.lang.String r7, int r8, java.util.ArrayList<com.mob.commons.cc.x> r9, int r10) {
        /*
            r6 = this;
            r0 = 1
            if (r10 == 0) goto L13
            com.mob.commons.cc.x r1 = new com.mob.commons.cc.x
            r2 = 29
            r1.<init>(r2)
            r1.f8327b = r7
            r1.f8328c = r8
            r1.f8334i = r0
            r9.add(r1)
        L13:
            com.mob.commons.cc.x r1 = new com.mob.commons.cc.x
            r1.<init>(r0)
            r1.f8327b = r7
            r1.f8328c = r8
            java.lang.String r2 = "arg"
            java.lang.StringBuilder r3 = android.support.v4.media.d.a(r2)
            int r4 = r10 + 1
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.f8333h = r3
            r9.add(r1)
            int r1 = r6.f8355b
            int r3 = r1 + (-1)
            r5 = 28
            if (r10 >= r3) goto L42
            r6.a(r7, r8, r9, r4)
            com.mob.commons.cc.x r0 = new com.mob.commons.cc.x
            r0.<init>(r5)
            goto Lb8
        L42:
            int r1 = r1 - r0
        L43:
            if (r1 < 0) goto L64
            com.mob.commons.cc.x r0 = new com.mob.commons.cc.x
            r3 = 3
            r0.<init>(r3)
            r0.f8327b = r7
            r0.f8328c = r8
            java.lang.StringBuilder r3 = android.support.v4.media.d.a(r2)
            int r4 = r1 + 1
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.f8333h = r3
            r9.add(r0)
            int r1 = r1 + (-1)
            goto L43
        L64:
            java.lang.String r0 = r6.f8354a
            if (r0 != 0) goto L83
            com.mob.commons.cc.x r0 = new com.mob.commons.cc.x
            r1 = 2
            r0.<init>(r1)
            r0.f8327b = r7
            r0.f8328c = r8
            r0.f8342q = r6
            r9.add(r0)
            com.mob.commons.cc.x r0 = new com.mob.commons.cc.x
            r1 = 32
            r0.<init>(r1)
            r0.f8327b = r7
            r0.f8328c = r8
            goto L92
        L83:
            com.mob.commons.cc.x r0 = new com.mob.commons.cc.x
            r1 = 31
            r0.<init>(r1)
            r0.f8327b = r7
            r0.f8328c = r8
            java.lang.String r1 = r6.f8354a
            r0.f8333h = r1
        L92:
            int r1 = r6.f8355b
            r0.f8334i = r1
            r9.add(r0)
            com.mob.commons.cc.v r0 = r6.f8359f
            java.util.ArrayList r0 = r0.a()
            java.util.Iterator r0 = r0.iterator()
        La3:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lbf
            java.lang.Object r1 = r0.next()
            com.mob.commons.cc.x r1 = (com.mob.commons.cc.x) r1
            int r1 = r1.f8326a
            if (r1 != r5) goto La3
            com.mob.commons.cc.x r0 = new com.mob.commons.cc.x
            r0.<init>(r5)
        Lb8:
            r0.f8327b = r7
            r0.f8328c = r8
            r9.add(r0)
        Lbf:
            if (r10 == 0) goto Lcf
            com.mob.commons.cc.x r10 = new com.mob.commons.cc.x
            r0 = 30
            r10.<init>(r0)
            r10.f8327b = r7
            r10.f8328c = r8
            r9.add(r10)
        Lcf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.commons.cc.y.a(java.lang.String, int, java.util.ArrayList, int):void");
    }

    public a a(Object... objArr) {
        a aVar = new a();
        try {
            LinkedList<Object> b10 = b(objArr);
            if (!b10.isEmpty()) {
                aVar.f8361b = b10.get(0);
            }
        } catch (Throwable th2) {
            aVar.f8360a = th2;
        }
        return aVar;
    }

    public y a(r rVar, String str, int i10) {
        if (this.f8355b <= 1) {
            return this;
        }
        ArrayList<x> arrayList = new ArrayList<>();
        a(str, i10, arrayList, 0);
        return new y(null, 1, arrayList, new ArrayList(), 0, arrayList.size(), rVar);
    }

    public LinkedList<Object> b(Object... objArr) {
        r b10 = this.f8356c.b();
        int i10 = this.f8355b;
        if (i10 != 0) {
            if (objArr.length == i10) {
                for (int length = objArr.length - 1; length >= 0; length--) {
                    b10.a(objArr[length]);
                }
            } else if (objArr.length < i10) {
                for (int length2 = objArr.length; length2 < this.f8355b; length2++) {
                    b10.a((Object) null);
                }
                for (int length3 = objArr.length - 1; length3 >= 0; length3--) {
                    b10.a(objArr[length3]);
                }
            } else {
                ArrayList arrayList = new ArrayList(0);
                for (int i11 = this.f8355b - 1; i11 < objArr.length; i11++) {
                    arrayList.add(objArr[i11]);
                }
                b10.a(arrayList);
                for (int i12 = this.f8355b - 2; i12 >= 0; i12--) {
                    b10.a(objArr[i12]);
                }
            }
        }
        LinkedList<Object> linkedList = new LinkedList<>();
        this.f8359f.a(this.f8357d, this.f8358e, b10, linkedList);
        return linkedList;
    }
}
