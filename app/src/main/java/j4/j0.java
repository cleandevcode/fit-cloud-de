package j4;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class j0 extends c1 implements t0 {

    /* renamed from: i */
    public final a0[] f17418i;

    /* renamed from: j */
    public final a0[] f17419j;

    /* renamed from: k */
    public final z0 f17420k;

    /* renamed from: l */
    public volatile transient long[] f17421l;

    /* renamed from: m */
    public volatile transient short[] f17422m;

    public j0(z0 z0Var) {
        a0[] a0VarArr;
        boolean z10;
        this.f17420k = z0Var;
        this.f17419j = new a0[z0Var.f17484e.length];
        int i10 = 0;
        while (true) {
            a0VarArr = this.f17419j;
            if (i10 >= a0VarArr.length) {
                break;
            }
            a0VarArr[i10] = new a0(z0Var.f17480a, z0Var.f17484e[i10]);
            i10++;
        }
        n4.c[] cVarArr = z0Var.f17483d;
        if (cVarArr == z0Var.f17484e) {
            this.f17418i = a0VarArr;
        } else {
            this.f17418i = new a0[cVarArr.length];
            int i11 = 0;
            while (true) {
                if (i11 >= this.f17418i.length) {
                    z10 = false;
                    break;
                }
                a0 j10 = j(z0Var.f17483d[i11].f21947a);
                if (j10 == null) {
                    z10 = true;
                    break;
                } else {
                    this.f17418i[i11] = j10;
                    i11++;
                }
            }
            if (z10) {
                a0[] a0VarArr2 = this.f17419j;
                System.arraycopy(a0VarArr2, 0, this.f17418i, 0, a0VarArr2.length);
            }
        }
        z0Var.getClass();
    }

    public static boolean s(i0 i0Var, Object obj, int i10) {
        IdentityHashMap<Object, y0> identityHashMap;
        y0 y0Var = i0Var.f17411o;
        int i11 = e1.DisableCircularReferenceDetect.f17396a;
        if (y0Var != null && (y0Var.f17478d & i11) == 0 && (i10 & i11) == 0 && (identityHashMap = i0Var.f17410n) != null && identityHashMap.containsKey(obj)) {
            i0Var.v(obj);
            return true;
        }
        return false;
    }

    @Override // j4.t0
    public final void e(i0 i0Var, Object obj, Object obj2, Type type, int i10) {
        o(i0Var, obj, obj2, type, i10, false);
    }

    public final boolean i(i0 i0Var, String str) {
        ArrayList arrayList = i0Var.f17342g;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!((l0) it.next()).apply()) {
                    return false;
                }
            }
        }
        ArrayList arrayList2 = this.f17342g;
        if (arrayList2 != null) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                if (!((l0) it2.next()).apply()) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    public final a0 j(String str) {
        if (str == null) {
            return null;
        }
        int i10 = 0;
        int length = this.f17419j.length - 1;
        while (i10 <= length) {
            int i11 = (i10 + length) >>> 1;
            int compareTo = this.f17419j[i11].f17298a.f21947a.compareTo(str);
            if (compareTo < 0) {
                i10 = i11 + 1;
            } else if (compareTo <= 0) {
                return this.f17419j[i11];
            } else {
                length = i11 - 1;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x00ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(java.lang.Object r16, java.lang.String r17, long r18) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.j0.k(java.lang.Object, java.lang.String, long):java.lang.Object");
    }

    public final ArrayList l(Object obj) {
        ArrayList arrayList = new ArrayList(this.f17419j.length);
        for (a0 a0Var : this.f17419j) {
            arrayList.add(a0Var.a(obj));
        }
        return arrayList;
    }

    public final LinkedHashMap m(Object obj) {
        a0[] a0VarArr;
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.f17419j.length);
        for (a0 a0Var : this.f17419j) {
            boolean d10 = e1.d(a0Var.f17300c, e1.SkipTransientField);
            n4.c cVar = a0Var.f17298a;
            if (!d10 || cVar == null || !cVar.f21958l) {
                if (cVar.f21962p) {
                    Object p10 = e4.a.p(a0Var.a(obj));
                    if (p10 instanceof Map) {
                        linkedHashMap.putAll((Map) p10);
                    } else {
                        str = a0Var.f17298a.f21947a;
                    }
                } else {
                    str = cVar.f21947a;
                }
                linkedHashMap.put(str, a0Var.a(obj));
            }
        }
        return linkedHashMap;
    }

    public final boolean n(i0 i0Var, int i10) {
        int i11 = e1.BeanToArray.f17396a;
        return ((this.f17420k.f17485f & i11) == 0 && !i0Var.f17406j.f17361i && (i10 & i11) == 0) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:520:0x00fd, code lost:
        if (r3.f21958l != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:584:0x01dd, code lost:
        if ((r3 & r5) == 0) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:600:0x0207, code lost:
        if ((r3 & r5) == 0) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:617:0x0236, code lost:
        if ((r3 & r5) == 0) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:634:0x0267, code lost:
        if ((r3 & r5) == 0) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:650:0x0299, code lost:
        if ((r32.f17420k.f17485f & r4) == 0) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:781:0x042e, code lost:
        if (r0 == false) goto L250;
     */
    /* JADX WARN: Removed duplicated region for block: B:499:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:553:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:738:0x03a1 A[Catch: Exception -> 0x043b, all -> 0x04ba, TryCatch #11 {Exception -> 0x043b, blocks: (B:561:0x0192, B:564:0x019a, B:566:0x01a7, B:568:0x01b1, B:571:0x01bb, B:573:0x01c7, B:575:0x01cb, B:578:0x01d2, B:585:0x01df, B:581:0x01d7, B:583:0x01dc, B:587:0x01e5, B:589:0x01f1, B:591:0x01f5, B:594:0x01fc, B:597:0x0201, B:599:0x0206, B:602:0x020c, B:604:0x0214, B:606:0x0220, B:608:0x0224, B:611:0x022b, B:618:0x0238, B:614:0x0230, B:616:0x0235, B:619:0x023d, B:621:0x0245, B:623:0x0251, B:625:0x0255, B:628:0x025c, B:635:0x0269, B:631:0x0261, B:633:0x0266, B:637:0x0270, B:639:0x0274, B:641:0x027e, B:645:0x0287, B:647:0x028b, B:649:0x0294, B:651:0x029b, B:653:0x02a1, B:655:0x02a5, B:658:0x02b0, B:660:0x02b4, B:662:0x02b8, B:665:0x02c3, B:667:0x02c7, B:669:0x02cb, B:672:0x02d6, B:674:0x02da, B:676:0x02de, B:679:0x02ec, B:681:0x02f0, B:683:0x02f4, B:686:0x0301, B:688:0x0305, B:690:0x0309, B:693:0x0317, B:695:0x031b, B:697:0x031f, B:701:0x032b, B:703:0x032f, B:705:0x0333, B:708:0x033e, B:710:0x034b, B:714:0x0354, B:718:0x035f, B:765:0x03fe, B:767:0x0402, B:769:0x0406, B:772:0x040f, B:774:0x0417, B:775:0x041f, B:777:0x0425, B:717:0x035c, B:720:0x0366, B:722:0x0372, B:729:0x0387, B:734:0x0391, B:738:0x03a1, B:741:0x03a9, B:744:0x03b3, B:746:0x03c3, B:751:0x03ce, B:749:0x03cb, B:752:0x03d2, B:753:0x03d6, B:755:0x03db, B:756:0x03df, B:757:0x03e3, B:759:0x03e7, B:761:0x03eb, B:764:0x03fb, B:735:0x0399), top: B:884:0x0192 }] */
    /* JADX WARN: Removed duplicated region for block: B:767:0x0402 A[Catch: Exception -> 0x043b, all -> 0x04ba, TryCatch #11 {Exception -> 0x043b, blocks: (B:561:0x0192, B:564:0x019a, B:566:0x01a7, B:568:0x01b1, B:571:0x01bb, B:573:0x01c7, B:575:0x01cb, B:578:0x01d2, B:585:0x01df, B:581:0x01d7, B:583:0x01dc, B:587:0x01e5, B:589:0x01f1, B:591:0x01f5, B:594:0x01fc, B:597:0x0201, B:599:0x0206, B:602:0x020c, B:604:0x0214, B:606:0x0220, B:608:0x0224, B:611:0x022b, B:618:0x0238, B:614:0x0230, B:616:0x0235, B:619:0x023d, B:621:0x0245, B:623:0x0251, B:625:0x0255, B:628:0x025c, B:635:0x0269, B:631:0x0261, B:633:0x0266, B:637:0x0270, B:639:0x0274, B:641:0x027e, B:645:0x0287, B:647:0x028b, B:649:0x0294, B:651:0x029b, B:653:0x02a1, B:655:0x02a5, B:658:0x02b0, B:660:0x02b4, B:662:0x02b8, B:665:0x02c3, B:667:0x02c7, B:669:0x02cb, B:672:0x02d6, B:674:0x02da, B:676:0x02de, B:679:0x02ec, B:681:0x02f0, B:683:0x02f4, B:686:0x0301, B:688:0x0305, B:690:0x0309, B:693:0x0317, B:695:0x031b, B:697:0x031f, B:701:0x032b, B:703:0x032f, B:705:0x0333, B:708:0x033e, B:710:0x034b, B:714:0x0354, B:718:0x035f, B:765:0x03fe, B:767:0x0402, B:769:0x0406, B:772:0x040f, B:774:0x0417, B:775:0x041f, B:777:0x0425, B:717:0x035c, B:720:0x0366, B:722:0x0372, B:729:0x0387, B:734:0x0391, B:738:0x03a1, B:741:0x03a9, B:744:0x03b3, B:746:0x03c3, B:751:0x03ce, B:749:0x03cb, B:752:0x03d2, B:753:0x03d6, B:755:0x03db, B:756:0x03df, B:757:0x03e3, B:759:0x03e7, B:761:0x03eb, B:764:0x03fb, B:735:0x0399), top: B:884:0x0192 }] */
    /* JADX WARN: Removed duplicated region for block: B:771:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:772:0x040f A[Catch: Exception -> 0x043b, all -> 0x04ba, TryCatch #11 {Exception -> 0x043b, blocks: (B:561:0x0192, B:564:0x019a, B:566:0x01a7, B:568:0x01b1, B:571:0x01bb, B:573:0x01c7, B:575:0x01cb, B:578:0x01d2, B:585:0x01df, B:581:0x01d7, B:583:0x01dc, B:587:0x01e5, B:589:0x01f1, B:591:0x01f5, B:594:0x01fc, B:597:0x0201, B:599:0x0206, B:602:0x020c, B:604:0x0214, B:606:0x0220, B:608:0x0224, B:611:0x022b, B:618:0x0238, B:614:0x0230, B:616:0x0235, B:619:0x023d, B:621:0x0245, B:623:0x0251, B:625:0x0255, B:628:0x025c, B:635:0x0269, B:631:0x0261, B:633:0x0266, B:637:0x0270, B:639:0x0274, B:641:0x027e, B:645:0x0287, B:647:0x028b, B:649:0x0294, B:651:0x029b, B:653:0x02a1, B:655:0x02a5, B:658:0x02b0, B:660:0x02b4, B:662:0x02b8, B:665:0x02c3, B:667:0x02c7, B:669:0x02cb, B:672:0x02d6, B:674:0x02da, B:676:0x02de, B:679:0x02ec, B:681:0x02f0, B:683:0x02f4, B:686:0x0301, B:688:0x0305, B:690:0x0309, B:693:0x0317, B:695:0x031b, B:697:0x031f, B:701:0x032b, B:703:0x032f, B:705:0x0333, B:708:0x033e, B:710:0x034b, B:714:0x0354, B:718:0x035f, B:765:0x03fe, B:767:0x0402, B:769:0x0406, B:772:0x040f, B:774:0x0417, B:775:0x041f, B:777:0x0425, B:717:0x035c, B:720:0x0366, B:722:0x0372, B:729:0x0387, B:734:0x0391, B:738:0x03a1, B:741:0x03a9, B:744:0x03b3, B:746:0x03c3, B:751:0x03ce, B:749:0x03cb, B:752:0x03d2, B:753:0x03d6, B:755:0x03db, B:756:0x03df, B:757:0x03e3, B:759:0x03e7, B:761:0x03eb, B:764:0x03fb, B:735:0x0399), top: B:884:0x0192 }] */
    /* JADX WARN: Removed duplicated region for block: B:785:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:815:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:823:0x04b0 A[Catch: all -> 0x04ba, Exception -> 0x04bf, TRY_LEAVE, TryCatch #7 {Exception -> 0x04bf, blocks: (B:817:0x0495, B:819:0x049d, B:821:0x04a5, B:823:0x04b0), top: B:877:0x0495 }] */
    /* JADX WARN: Removed duplicated region for block: B:838:0x04f5 A[Catch: all -> 0x0504, TRY_ENTER, TryCatch #1 {all -> 0x0504, blocks: (B:838:0x04f5, B:847:0x0526, B:849:0x0541, B:851:0x0547, B:852:0x055f, B:854:0x0563, B:858:0x056c, B:859:0x0571, B:842:0x0508, B:844:0x050c, B:846:0x0510, B:848:0x052b), top: B:866:0x04f3 }] */
    /* JADX WARN: Removed duplicated region for block: B:841:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:851:0x0547 A[Catch: all -> 0x0504, TryCatch #1 {all -> 0x0504, blocks: (B:838:0x04f5, B:847:0x0526, B:849:0x0541, B:851:0x0547, B:852:0x055f, B:854:0x0563, B:858:0x056c, B:859:0x0571, B:842:0x0508, B:844:0x050c, B:846:0x0510, B:848:0x052b), top: B:866:0x04f3 }] */
    /* JADX WARN: Removed duplicated region for block: B:854:0x0563 A[Catch: all -> 0x0504, TryCatch #1 {all -> 0x0504, blocks: (B:838:0x04f5, B:847:0x0526, B:849:0x0541, B:851:0x0547, B:852:0x055f, B:854:0x0563, B:858:0x056c, B:859:0x0571, B:842:0x0508, B:844:0x050c, B:846:0x0510, B:848:0x052b), top: B:866:0x04f3 }] */
    /* JADX WARN: Removed duplicated region for block: B:856:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:857:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:872:0x00d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o(j4.i0 r33, java.lang.Object r34, java.lang.Object r35, java.lang.reflect.Type r36, int r37, boolean r38) {
        /*
            Method dump skipped, instructions count: 1399
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.j0.o(j4.i0, java.lang.Object, java.lang.Object, java.lang.reflect.Type, int, boolean):void");
    }

    public final void p(i0 i0Var, Object obj, char c10) {
        ArrayList arrayList = i0Var.f17337b;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                c10 = ((c) it.next()).e(i0Var, obj, c10);
            }
        }
        ArrayList arrayList2 = this.f17337b;
        if (arrayList2 != null) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                c10 = ((c) it2.next()).e(i0Var, obj, c10);
            }
        }
    }

    public final char q(i0 i0Var, Object obj, char c10) {
        ArrayList arrayList = i0Var.f17336a;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                c10 = ((k) it.next()).e(i0Var, obj, c10);
            }
        }
        ArrayList arrayList2 = this.f17336a;
        if (arrayList2 != null) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                c10 = ((k) it2.next()).e(i0Var, obj, c10);
            }
        }
        return c10;
    }

    public final void r(i0 i0Var, Object obj, String str) {
        if (str == null) {
            str = i0Var.f17405i.f17324c;
        }
        i0Var.f17406j.y(str);
        String str2 = this.f17420k.f17481b;
        if (str2 == null) {
            Class<?> cls = obj.getClass();
            if (n4.n.Y(cls)) {
                cls = cls.getSuperclass();
            }
            str2 = cls.getName();
        }
        i0Var.t(str2);
    }
}
