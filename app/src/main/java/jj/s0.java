package jj;

import qj.a;

/* loaded from: classes2.dex */
public final class s0 extends gm.m implements fm.l<bj.b, qj.a> {

    /* renamed from: b */
    public static final s0 f17975b = new s0();

    public s0() {
        super(1);
    }

    @Override // fm.l
    public final qj.a k(bj.b bVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        bj.b bVar2 = bVar;
        byte[] bArr = bVar2.f4399c;
        if (bArr != null) {
            qj.a aVar = new qj.a();
            int i10 = 0;
            while (i10 < bArr.length) {
                int i11 = i10 + 1;
                int i12 = bArr[i10] & 255;
                boolean z16 = true;
                if (i12 != 0 && i11 + i12 <= bArr.length) {
                    int i13 = i11 + 1;
                    switch (bArr[i11]) {
                        case 1:
                            if (i12 < 10) {
                                break;
                            } else {
                                a.e eVar = new a.e();
                                eVar.f24932a = bi.r.i(bArr, i13, 2);
                                eVar.f24933b = bArr[i13 + 2] & 255;
                                eVar.f24934c = bi.r.i(bArr, i13 + 3, 2);
                                byte[] bArr2 = new byte[4];
                                System.arraycopy(bArr, i13 + 5, bArr2, 0, 4);
                                eVar.f24935d = bi.r.h(bArr2).replaceAll(" ", "");
                                aVar.f24880a = eVar;
                                break;
                            }
                        case 2:
                            if (i12 < 3) {
                                break;
                            } else {
                                aVar.f24881b = bArr[i13] & 255;
                                aVar.f24882c = bArr[i13 + 1] & 255;
                                break;
                            }
                        case 3:
                            if (i12 < 2) {
                                break;
                            } else {
                                aVar.f24883d = bArr[i13] & 255;
                                break;
                            }
                        case 4:
                            if (i12 < 7) {
                                break;
                            } else {
                                a.d dVar = new a.d();
                                dVar.f24924a = bArr[i13] & 255;
                                byte b10 = bArr[i13 + 1];
                                if ((b10 & 1) > 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                dVar.f24925b = z10;
                                if ((b10 & 2) > 0) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                dVar.f24926c = z11;
                                if ((b10 & 4) > 0) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                dVar.f24927d = z12;
                                if ((b10 & 8) > 0) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                dVar.f24928e = z13;
                                if ((b10 & 16) > 0) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                dVar.f24929f = z14;
                                if ((b10 & 32) <= 0) {
                                    z16 = false;
                                }
                                dVar.f24930g = z16;
                                byte[] bArr3 = new byte[4];
                                System.arraycopy(bArr, i13 + 2, bArr3, 0, 4);
                                dVar.f24931h = bi.r.h(bArr3).replaceAll(" ", "");
                                aVar.f24884e = dVar;
                                break;
                            }
                        case 5:
                            if (i12 < 6) {
                                break;
                            } else {
                                aVar.f24885f = bArr[i13] & 255;
                                byte[] bArr4 = new byte[4];
                                System.arraycopy(bArr, i13 + 1, bArr4, 0, 4);
                                aVar.f24886g = bi.r.h(bArr4).replaceAll(" ", "");
                                break;
                            }
                        case 6:
                            if (i12 < 2) {
                                break;
                            } else {
                                aVar.f24887h = bArr[i13] & 255;
                                break;
                            }
                        case 7:
                            if (i12 < 4) {
                                break;
                            } else {
                                aVar.f24888i = bArr[i13] & 255;
                                if ((bArr[i13 + 1] & 255) <= 0) {
                                    z16 = false;
                                }
                                aVar.f24889j = z16;
                                aVar.f24890k = bArr[i13 + 2] & 255;
                                break;
                            }
                        case 8:
                            if (i12 < 3) {
                                break;
                            } else {
                                aVar.f24891l = bArr[i13] & 255;
                                if ((bArr[i13 + 1] & 255) <= 0) {
                                    z16 = false;
                                }
                                aVar.f24892m = z16;
                                break;
                            }
                        case 9:
                            if (i12 < 9) {
                                break;
                            } else {
                                a.b bVar3 = new a.b();
                                bVar3.f24912a = bArr[i13] & 255;
                                byte[] bArr5 = new byte[4];
                                System.arraycopy(bArr, i13 + 1, bArr5, 0, 4);
                                bVar3.f24913b = bi.r.h(bArr5).replaceAll(" ", "");
                                bVar3.f24914c = bArr[i13 + 5] & 255;
                                if ((bArr[i13 + 6] & 255) > 0) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                bVar3.f24915d = z15;
                                if ((bArr[i13 + 7] & 255) <= 0) {
                                    z16 = false;
                                }
                                bVar3.f24916e = z16;
                                aVar.f24893n = bVar3;
                                break;
                            }
                        case 10:
                            if (i12 < 2) {
                                break;
                            } else {
                                aVar.f24894o = bArr[i13] & 255;
                                break;
                            }
                        case 11:
                            if (i12 < 8) {
                                break;
                            } else {
                                a.C0451a c0451a = new a.C0451a();
                                c0451a.f24906a = bArr[i13] & 255;
                                c0451a.f24907b = bArr[i13 + 1] & 255;
                                c0451a.f24908c = bArr[i13 + 2] & 255;
                                c0451a.f24909d = bArr[i13 + 3] & 255;
                                c0451a.f24910e = bi.r.i(bArr, i13 + 4, 2);
                                c0451a.f24911f = bArr[i13 + 6] & 255;
                                aVar.f24895p = c0451a;
                                break;
                            }
                        case 12:
                            if (i12 < 2) {
                                break;
                            } else {
                                aVar.f24896q = bArr[i13] & 255;
                                break;
                            }
                        case 13:
                            if (i12 < 2) {
                                break;
                            } else {
                                aVar.f24897r = bArr[i13] & 255;
                                break;
                            }
                        case 14:
                            if (i12 < 2) {
                                break;
                            } else {
                                aVar.f24898s = bArr[i13] & 255;
                                break;
                            }
                        case 15:
                            if (i12 < 10) {
                                break;
                            } else {
                                a.c cVar = new a.c();
                                cVar.f24917a = bi.r.i(bArr, i13, 2);
                                cVar.f24918b = bi.r.i(bArr, i13 + 2, 2);
                                if ((bArr[i13 + 4] & 255) <= 0) {
                                    z16 = false;
                                }
                                cVar.f24919c = z16;
                                cVar.f24920d = bArr[i13 + 5] & 255;
                                cVar.f24921e = bArr[i13 + 6] & 255;
                                cVar.f24922f = bArr[i13 + 7] & 255;
                                cVar.f24923g = bArr[i13 + 8] & 255;
                                aVar.f24899t = cVar;
                                break;
                            }
                        case 16:
                            if (i12 < 4) {
                                break;
                            } else {
                                aVar.f24900u = bArr[i13] & 255;
                                aVar.f24901v = bArr[i13 + 1] & 255;
                                aVar.f24902w = bArr[i13 + 2] & 255;
                                break;
                            }
                        case 17:
                            if (i12 < 3) {
                                break;
                            } else {
                                aVar.f24903x = bArr[i13] & 255;
                                aVar.f24904y = bArr[i13 + 1] & 255;
                                break;
                            }
                        case 18:
                            if (i12 >= 2) {
                                if ((bArr[i13] & 255) <= 0) {
                                    z16 = false;
                                }
                                aVar.f24905z = z16;
                                break;
                            } else {
                                break;
                            }
                        case 19:
                            if (i12 >= 2) {
                                if ((bArr[i13] & 255) <= 0) {
                                    z16 = false;
                                }
                                aVar.A = z16;
                                break;
                            } else {
                                break;
                            }
                        case 20:
                            if (i12 >= 2) {
                                if ((bArr[i13] & 255) <= 0) {
                                    z16 = false;
                                }
                                aVar.B = z16;
                                break;
                            } else {
                                break;
                            }
                        case 21:
                            if (i12 >= 2) {
                                if ((bArr[i13] & 255) <= 0) {
                                    z16 = false;
                                }
                                aVar.C = z16;
                                break;
                            } else {
                                break;
                            }
                    }
                    i10 = (i12 - 1) + i13;
                } else {
                    p000do.a.f13275a.p("parserAssistInfo error length:%s", bVar2.toString());
                    return aVar;
                }
            }
            return aVar;
        }
        throw new yi.f(bVar2);
    }
}
