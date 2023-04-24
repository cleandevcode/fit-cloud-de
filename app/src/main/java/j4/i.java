package j4;

import h4.a;
import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.Rectangle;
import java.lang.reflect.Type;

/* loaded from: classes.dex */
public final class i implements t0, i4.t {

    /* renamed from: a */
    public static final i f17404a = new i();

    public static Color f(h4.a aVar) {
        h4.c cVar = aVar.f15774f;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (cVar.h0() != 13) {
            if (cVar.h0() == 4) {
                String W = cVar.W();
                cVar.D();
                if (cVar.h0() == 2) {
                    int E = cVar.E();
                    cVar.nextToken();
                    if (W.equalsIgnoreCase("r")) {
                        i10 = E;
                    } else if (W.equalsIgnoreCase("g")) {
                        i11 = E;
                    } else if (W.equalsIgnoreCase("b")) {
                        i12 = E;
                    } else if (W.equalsIgnoreCase("alpha")) {
                        i13 = E;
                    } else {
                        throw new e4.d(a.b.b("syntax error, ", W));
                    }
                    if (cVar.h0() == 16) {
                        cVar.J(4);
                    }
                } else {
                    throw new e4.d("syntax error");
                }
            } else {
                throw new e4.d("syntax error");
            }
        }
        cVar.nextToken();
        return new Color(i10, i11, i12, i13);
    }

    public static Font g(h4.a aVar) {
        h4.c cVar = aVar.f15774f;
        int i10 = 0;
        String str = null;
        int i11 = 0;
        while (cVar.h0() != 13) {
            if (cVar.h0() == 4) {
                String W = cVar.W();
                cVar.D();
                if (W.equalsIgnoreCase("name")) {
                    if (cVar.h0() == 4) {
                        str = cVar.W();
                    } else {
                        throw new e4.d("syntax error");
                    }
                } else if (W.equalsIgnoreCase("style")) {
                    if (cVar.h0() == 2) {
                        i10 = cVar.E();
                    } else {
                        throw new e4.d("syntax error");
                    }
                } else if (W.equalsIgnoreCase("size")) {
                    if (cVar.h0() == 2) {
                        i11 = cVar.E();
                    } else {
                        throw new e4.d("syntax error");
                    }
                } else {
                    throw new e4.d(a.b.b("syntax error, ", W));
                }
                cVar.nextToken();
                if (cVar.h0() == 16) {
                    cVar.J(4);
                }
            } else {
                throw new e4.d("syntax error");
            }
        }
        cVar.nextToken();
        return new Font(str, i10, i11);
    }

    public static Point h(h4.a aVar, Object obj) {
        int e02;
        h4.c cVar = aVar.f15774f;
        int i10 = 0;
        int i11 = 0;
        while (cVar.h0() != 13) {
            if (cVar.h0() == 4) {
                String W = cVar.W();
                if (e4.a.f13341c.equals(W)) {
                    aVar.b();
                } else if ("$ref".equals(W)) {
                    h4.c cVar2 = aVar.f15774f;
                    cVar2.D();
                    String W2 = cVar2.W();
                    aVar.e0(aVar.f15775g, obj);
                    aVar.h(new a.C0282a(aVar.f15775g, W2));
                    aVar.X();
                    aVar.f15779k = 1;
                    cVar2.J(13);
                    aVar.a(13);
                    return null;
                } else {
                    cVar.D();
                    int h02 = cVar.h0();
                    if (h02 == 2) {
                        e02 = cVar.E();
                    } else if (h02 == 3) {
                        e02 = (int) cVar.e0();
                    } else {
                        StringBuilder a10 = android.support.v4.media.d.a("syntax error : ");
                        a10.append(cVar.z0());
                        throw new e4.d(a10.toString());
                    }
                    cVar.nextToken();
                    if (W.equalsIgnoreCase("x")) {
                        i10 = e02;
                    } else if (W.equalsIgnoreCase("y")) {
                        i11 = e02;
                    } else {
                        throw new e4.d(a.b.b("syntax error, ", W));
                    }
                    if (cVar.h0() == 16) {
                        cVar.J(4);
                    }
                }
            } else {
                throw new e4.d("syntax error");
            }
        }
        cVar.nextToken();
        return new Point(i10, i11);
    }

    public static Rectangle i(h4.a aVar) {
        int e02;
        h4.c cVar = aVar.f15774f;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (cVar.h0() != 13) {
            if (cVar.h0() == 4) {
                String W = cVar.W();
                cVar.D();
                int h02 = cVar.h0();
                if (h02 == 2) {
                    e02 = cVar.E();
                } else if (h02 == 3) {
                    e02 = (int) cVar.e0();
                } else {
                    throw new e4.d("syntax error");
                }
                cVar.nextToken();
                if (W.equalsIgnoreCase("x")) {
                    i10 = e02;
                } else if (W.equalsIgnoreCase("y")) {
                    i11 = e02;
                } else if (W.equalsIgnoreCase("width")) {
                    i12 = e02;
                } else if (W.equalsIgnoreCase("height")) {
                    i13 = e02;
                } else {
                    throw new e4.d(a.b.b("syntax error, ", W));
                }
                if (cVar.h0() == 16) {
                    cVar.J(4);
                }
            } else {
                throw new e4.d("syntax error");
            }
        }
        cVar.nextToken();
        return new Rectangle(i10, i11, i12, i13);
    }

    public static boolean j(Class<?> cls) {
        return cls == Point.class || cls == Rectangle.class || cls == Font.class || cls == Color.class;
    }

    public static char k(d1 d1Var, Class cls) {
        if (!d1Var.q(e1.WriteClassName)) {
            return '{';
        }
        d1Var.write(123);
        d1Var.y(e4.a.f13341c);
        d1Var.Z(cls.getName());
        return ',';
    }

    @Override // i4.t
    public final int b() {
        return 12;
    }

    @Override // i4.t
    public final <T> T d(h4.a aVar, Type type, Object obj) {
        T t10;
        h4.c cVar = aVar.f15774f;
        if (cVar.h0() == 8) {
            cVar.J(16);
            return null;
        } else if (cVar.h0() != 12 && cVar.h0() != 16) {
            throw new e4.d("syntax error");
        } else {
            cVar.nextToken();
            if (type == Point.class) {
                t10 = (T) h(aVar, obj);
            } else if (type == Rectangle.class) {
                t10 = (T) i(aVar);
            } else if (type == Color.class) {
                t10 = (T) f(aVar);
            } else if (type == Font.class) {
                t10 = (T) g(aVar);
            } else {
                throw new e4.d("not support awt class : " + type);
            }
            h4.j jVar = aVar.f15775g;
            aVar.e0(t10, obj);
            aVar.h0(jVar);
            return t10;
        }
    }

    @Override // j4.t0
    public final void e(i0 i0Var, Object obj, Object obj2, Type type, int i10) {
        int alpha;
        String str;
        d1 d1Var = i0Var.f17406j;
        if (obj == null) {
            d1Var.R();
            return;
        }
        if (obj instanceof Point) {
            Point point = (Point) obj;
            d1Var.C(k(d1Var, Point.class), point.x, "x");
            d1Var.C(',', point.y, "y");
        } else {
            if (obj instanceof Font) {
                Font font = (Font) obj;
                d1Var.E(k(d1Var, Font.class), "name", font.getName());
                d1Var.C(',', font.getStyle(), "style");
                alpha = font.getSize();
                str = "size";
            } else if (obj instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) obj;
                d1Var.C(k(d1Var, Rectangle.class), rectangle.x, "x");
                d1Var.C(',', rectangle.y, "y");
                d1Var.C(',', rectangle.width, "width");
                alpha = rectangle.height;
                str = "height";
            } else if (obj instanceof Color) {
                Color color = (Color) obj;
                d1Var.C(k(d1Var, Color.class), color.getRed(), "r");
                d1Var.C(',', color.getGreen(), "g");
                d1Var.C(',', color.getBlue(), "b");
                if (color.getAlpha() > 0) {
                    alpha = color.getAlpha();
                    str = "alpha";
                }
            } else {
                StringBuilder a10 = android.support.v4.media.d.a("not support awt class : ");
                a10.append(obj.getClass().getName());
                throw new e4.d(a10.toString());
            }
            d1Var.C(',', alpha, str);
        }
        d1Var.write(125);
    }
}
