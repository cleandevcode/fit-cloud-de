package a;

import android.util.Log;
import c4.h;
import com.bumptech.glide.manager.i;
import com.bumptech.glide.manager.j;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.EnumMap;
import java.util.LinkedList;
import java.util.List;
import r4.k;
import rm.l;
import t4.x;

/* loaded from: classes.dex */
public final class g implements h, r4.d, k, i, za.f, db.c {

    /* renamed from: a */
    public final /* synthetic */ int f8a;

    public g() {
        this.f8a = 0;
    }

    @Override // c4.h
    public final void a() {
    }

    @Override // r4.k
    public final r4.c b(r4.h hVar) {
        return r4.c.SOURCE;
    }

    @Override // c4.h
    public final void c(int i10, int i11, String str) {
    }

    @Override // za.f
    public final bb.b d(String str, za.a aVar, EnumMap enumMap) {
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z10;
        int i14;
        int i15;
        bb.a aVar2;
        int i16;
        boolean z11;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        byte b10;
        int i23;
        boolean z12;
        Charset charset = StandardCharsets.ISO_8859_1;
        za.c cVar = za.c.CHARACTER_SET;
        if (enumMap.containsKey(cVar)) {
            charset = Charset.forName(enumMap.get(cVar).toString());
        }
        za.c cVar2 = za.c.ERROR_CORRECTION;
        if (enumMap.containsKey(cVar2)) {
            i10 = Integer.parseInt(enumMap.get(cVar2).toString());
        } else {
            i10 = 33;
        }
        za.c cVar3 = za.c.AZTEC_LAYERS;
        if (enumMap.containsKey(cVar3)) {
            i11 = Integer.parseInt(enumMap.get(cVar3).toString());
        } else {
            i11 = 0;
        }
        if (aVar == za.a.AZTEC) {
            ab.d dVar = new ab.d(str.getBytes(charset));
            List<ab.f> singletonList = Collections.singletonList(ab.f.f446e);
            int i24 = 0;
            while (true) {
                byte[] bArr = dVar.f443a;
                i12 = 32;
                int i25 = 4;
                int i26 = 2;
                i13 = 1;
                if (i24 >= bArr.length) {
                    break;
                }
                int i27 = i24 + 1;
                if (i27 < bArr.length) {
                    b10 = bArr[i27];
                } else {
                    b10 = 0;
                }
                byte b11 = bArr[i24];
                if (b11 != 13) {
                    if (b11 != 44) {
                        if (b11 != 46) {
                            if (b11 == 58 && b10 == 32) {
                                i23 = 5;
                            }
                            i23 = 0;
                        } else {
                            if (b10 == 32) {
                                i23 = 3;
                            }
                            i23 = 0;
                        }
                    } else {
                        if (b10 == 32) {
                            i23 = 4;
                        }
                        i23 = 0;
                    }
                } else {
                    if (b10 == 10) {
                        i23 = 2;
                    }
                    i23 = 0;
                }
                if (i23 > 0) {
                    LinkedList linkedList = new LinkedList();
                    for (ab.f fVar : singletonList) {
                        ab.f b12 = fVar.b(i24);
                        linkedList.add(b12.d(4, i23));
                        if (fVar.f447a != 4) {
                            linkedList.add(b12.e(4, i23));
                        }
                        if (i23 == 3 || i23 == 4) {
                            linkedList.add(b12.d(2, 16 - i23).d(2, 1));
                        }
                        if (fVar.f449c > 0) {
                            linkedList.add(fVar.a(i24).a(i27));
                        }
                    }
                    singletonList = ab.d.a(linkedList);
                    i24 = i27;
                } else {
                    LinkedList linkedList2 = new LinkedList();
                    for (ab.f fVar2 : singletonList) {
                        char c10 = (char) (dVar.f443a[i24] & 255);
                        if (ab.d.f441d[fVar2.f447a][c10] > 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        int i28 = 0;
                        ab.f fVar3 = null;
                        while (i28 <= i25) {
                            int i29 = ab.d.f441d[i28][c10];
                            if (i29 > 0) {
                                if (fVar3 == null) {
                                    fVar3 = fVar2.b(i24);
                                }
                                if (!z12 || i28 == fVar2.f447a || i28 == i26) {
                                    linkedList2.add(fVar3.d(i28, i29));
                                }
                                if (!z12 && ab.d.f442e[fVar2.f447a][i28] >= 0) {
                                    linkedList2.add(fVar3.e(i28, i29));
                                }
                            }
                            i28++;
                            i25 = 4;
                            i26 = 2;
                        }
                        if (fVar2.f449c > 0 || ab.d.f441d[fVar2.f447a][c10] == 0) {
                            linkedList2.add(fVar2.a(i24));
                        }
                        i25 = 4;
                        i26 = 2;
                    }
                    singletonList = ab.d.a(linkedList2);
                }
                i24++;
            }
            ab.f fVar4 = (ab.f) Collections.min(singletonList, new ab.c());
            byte[] bArr2 = dVar.f443a;
            fVar4.getClass();
            LinkedList<ab.g> linkedList3 = new LinkedList();
            for (ab.g gVar = fVar4.b(bArr2.length).f448b; gVar != null; gVar = gVar.f452a) {
                linkedList3.addFirst(gVar);
            }
            bb.a aVar3 = new bb.a();
            for (ab.g gVar2 : linkedList3) {
                gVar2.a(aVar3, bArr2);
            }
            int i30 = aVar3.f4127b;
            int i31 = 11;
            int i32 = ((i10 * i30) / 100) + 11;
            int i33 = i30 + i32;
            if (i11 != 0) {
                if (i11 < 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                i17 = Math.abs(i11);
                if (z11) {
                    i12 = 4;
                }
                if (i17 <= i12) {
                    if (z11) {
                        i22 = 88;
                    } else {
                        i22 = 112;
                    }
                    i18 = (i22 + (i17 << 4)) * i17;
                    i16 = ab.b.f438a[i17];
                    int i34 = i18 - (i18 % i16);
                    aVar2 = ab.b.i(i16, aVar3);
                    int i35 = aVar2.f4127b;
                    if (i32 + i35 <= i34) {
                        if (z11 && i35 > (i16 << 6)) {
                            throw new IllegalArgumentException("Data to large for user specified layer");
                        }
                    } else {
                        throw new IllegalArgumentException("Data to large for user specified layer");
                    }
                } else {
                    throw new IllegalArgumentException(String.format("Illegal value %s for layers", Integer.valueOf(i11)));
                }
            } else {
                int i36 = 0;
                bb.a aVar4 = null;
                int i37 = 0;
                while (i36 <= i12) {
                    if (i36 <= 3) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        i14 = i36 + 1;
                    } else {
                        i14 = i36;
                    }
                    if (z10) {
                        i15 = 88;
                    } else {
                        i15 = 112;
                    }
                    int i38 = (i15 + (i14 << 4)) * i14;
                    if (i33 <= i38) {
                        if (aVar4 == null || i37 != ab.b.f438a[i14]) {
                            int i39 = ab.b.f438a[i14];
                            i37 = i39;
                            aVar4 = ab.b.i(i39, aVar3);
                        }
                        int i40 = i38 - (i38 % i37);
                        if ((!z10 || aVar4.f4127b <= (i37 << 6)) && aVar4.f4127b + i32 <= i40) {
                            aVar2 = aVar4;
                            i16 = i37;
                            z11 = z10;
                            i17 = i14;
                            i18 = i38;
                        }
                    }
                    i36++;
                    i12 = 32;
                    i13 = 1;
                }
                throw new IllegalArgumentException("Data too large for an Aztec code");
            }
            bb.a h10 = ab.b.h(aVar2, i18, i16);
            int i41 = aVar2.f4127b / i16;
            bb.a aVar5 = new bb.a();
            int i42 = i17 - 1;
            if (z11) {
                aVar5.b(i42, 2);
                aVar5.b(i41 - 1, 6);
                i19 = 28;
            } else {
                aVar5.b(i42, 5);
                aVar5.b(i41 - 1, 11);
                i19 = 40;
            }
            bb.a h11 = ab.b.h(aVar5, i19, 4);
            if (!z11) {
                i31 = 14;
            }
            int i43 = i31 + (i17 << 2);
            int[] iArr = new int[i43];
            if (z11) {
                for (int i44 = 0; i44 < i43; i44++) {
                    iArr[i44] = i44;
                }
                i20 = i43;
            } else {
                int i45 = i43 / 2;
                i20 = (((i45 - 1) / 15) * 2) + i43 + 1;
                int i46 = i20 / 2;
                for (int i47 = 0; i47 < i45; i47++) {
                    int i48 = (i47 / 15) + i47;
                    iArr[(i45 - i47) - i13] = (i46 - i48) - i13;
                    iArr[i45 + i47] = i48 + i46 + i13;
                }
            }
            bb.b bVar = new bb.b(i20, i20);
            int i49 = 0;
            for (int i50 = 0; i50 < i17; i50++) {
                int i51 = (i17 - i50) << 2;
                if (z11) {
                    i21 = 9;
                } else {
                    i21 = 12;
                }
                int i52 = i51 + i21;
                for (int i53 = 0; i53 < i52; i53++) {
                    int i54 = i53 << 1;
                    for (int i55 = 0; i55 < 2; i55++) {
                        if (h10.d(i49 + i54 + i55)) {
                            int i56 = i50 << 1;
                            bVar.b(iArr[i56 + i55], iArr[i56 + i53]);
                        }
                        if (h10.d((i52 << 1) + i49 + i54 + i55)) {
                            int i57 = i50 << 1;
                            bVar.b(iArr[i57 + i53], iArr[((i43 - 1) - i57) - i55]);
                        }
                        if (h10.d((i52 << 2) + i49 + i54 + i55)) {
                            int i58 = (i43 - 1) - (i50 << 1);
                            bVar.b(iArr[i58 - i55], iArr[i58 - i53]);
                        }
                        if (h10.d((i52 * 6) + i49 + i54 + i55)) {
                            int i59 = i50 << 1;
                            bVar.b(iArr[((i43 - 1) - i59) - i53], iArr[i59 + i55]);
                        }
                    }
                }
                i49 += i52 << 3;
            }
            int i60 = i20 / 2;
            int i61 = 0;
            if (z11) {
                while (i61 < 7) {
                    int i62 = (i60 - 3) + i61;
                    if (h11.d(i61)) {
                        bVar.b(i62, i60 - 5);
                    }
                    if (h11.d(i61 + 7)) {
                        bVar.b(i60 + 5, i62);
                    }
                    if (h11.d(20 - i61)) {
                        bVar.b(i62, i60 + 5);
                    }
                    if (h11.d(27 - i61)) {
                        bVar.b(i60 - 5, i62);
                    }
                    i61++;
                }
            } else {
                while (i61 < 10) {
                    int i63 = (i61 / 5) + (i60 - 5) + i61;
                    if (h11.d(i61)) {
                        bVar.b(i63, i60 - 7);
                    }
                    if (h11.d(i61 + 10)) {
                        bVar.b(i60 + 7, i63);
                    }
                    if (h11.d(29 - i61)) {
                        bVar.b(i63, i60 + 7);
                    }
                    if (h11.d(39 - i61)) {
                        bVar.b(i60 - 7, i63);
                    }
                    i61++;
                }
            }
            if (z11) {
                ab.b.g(bVar, i60, 5);
            } else {
                ab.b.g(bVar, i60, 7);
                int i64 = 0;
                int i65 = 0;
                while (i64 < (i43 / 2) - 1) {
                    for (int i66 = i60 & 1; i66 < i20; i66 += 2) {
                        int i67 = i60 - i65;
                        bVar.b(i67, i66);
                        int i68 = i60 + i65;
                        bVar.b(i68, i66);
                        bVar.b(i66, i67);
                        bVar.b(i66, i68);
                    }
                    i64 += 15;
                    i65 += 16;
                }
            }
            int i69 = bVar.f4128a;
            int i70 = bVar.f4129b;
            int max = Math.max(200, i69);
            int max2 = Math.max(200, i70);
            int min = Math.min(max / i69, max2 / i70);
            int i71 = (max - (i69 * min)) / 2;
            int i72 = (max2 - (i70 * min)) / 2;
            bb.b bVar2 = new bb.b(max, max2);
            int i73 = 0;
            while (i73 < i70) {
                int i74 = 0;
                int i75 = i71;
                while (i74 < i69) {
                    if (bVar.a(i74, i73)) {
                        bVar2.c(i75, i72, min, min);
                    }
                    i74++;
                    i75 += min;
                }
                i73++;
                i72 += min;
            }
            return bVar2;
        }
        throw new IllegalArgumentException("Can only encode AZTEC, but got ".concat(String.valueOf(aVar)));
    }

    @Override // r4.d
    public final boolean e(Object obj, File file, r4.h hVar) {
        switch (this.f8a) {
            case 1:
                try {
                    m5.a.d((ByteBuffer) obj, file);
                    return true;
                } catch (IOException e10) {
                    if (Log.isLoggable("ByteBufferEncoder", 3)) {
                        Log.d("ByteBufferEncoder", "Failed to write data", e10);
                    }
                    return false;
                }
            default:
                try {
                    m5.a.d(((e5.c) ((x) obj).get()).f13443a.f13453a.f13455a.getData().asReadOnlyBuffer(), file);
                    return true;
                } catch (IOException e11) {
                    if (Log.isLoggable("GifEncoder", 5)) {
                        Log.w("GifEncoder", "Failed to encode GIF drawable data", e11);
                    }
                    return false;
                }
        }
    }

    @Override // com.bumptech.glide.manager.i
    public final void f(j jVar) {
        jVar.onStart();
    }

    @Override // com.bumptech.glide.manager.i
    public final void g(j jVar) {
    }

    @Override // db.c
    public final void h(db.d dVar) {
        boolean z10;
        StringBuilder sb2 = new StringBuilder();
        sb2.append((char) 0);
        while (true) {
            if (!dVar.c()) {
                break;
            }
            sb2.append(dVar.b());
            int i10 = dVar.f12975f + 1;
            dVar.f12975f = i10;
            if (l.o(dVar.f12970a, i10, 5) != 5) {
                dVar.f12976g = 0;
                break;
            }
        }
        int length = sb2.length() - 1;
        int a10 = dVar.a() + length + 1;
        dVar.d(a10);
        if (dVar.f12977h.f12985b - a10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (dVar.c() || z10) {
            if (length <= 249) {
                sb2.setCharAt(0, (char) length);
            } else if (length <= 1555) {
                sb2.setCharAt(0, (char) ((length / 250) + 249));
                sb2.insert(1, (char) (length % 250));
            } else {
                throw new IllegalStateException("Message length not in valid ranges: ".concat(String.valueOf(length)));
            }
        }
        int length2 = sb2.length();
        for (int i11 = 0; i11 < length2; i11++) {
            int a11 = (((dVar.a() + 1) * 149) % 255) + 1 + sb2.charAt(i11);
            if (a11 > 255) {
                a11 -= 256;
            }
            dVar.e((char) a11);
        }
    }

    public /* synthetic */ g(int i10) {
        this.f8a = i10;
    }
}
