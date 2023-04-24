package z6;

import android.content.Context;
import android.graphics.Point;
import android.os.RemoteException;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.LatLng;
import d9.k;
import gm.l;
import i8.p;
import x2.i;

/* loaded from: classes.dex */
public final class h extends b9.b implements b9.d {

    /* renamed from: b */
    public GestureDetector f32008b;

    /* renamed from: c */
    public b9.a f32009c;

    /* renamed from: d */
    public final a f32010d;

    /* loaded from: classes.dex */
    public static final class a extends GestureDetector.SimpleOnGestureListener {
        public a() {
            h.this = r1;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            int left;
            int top;
            boolean z10;
            LatLng latLng;
            double d10;
            boolean z11;
            double d11;
            boolean z12;
            boolean z13;
            l.f(motionEvent, "e1");
            l.f(motionEvent2, "e2");
            b9.a aVar = h.this.f32009c;
            if (aVar == null) {
                return false;
            }
            LatLng latLng2 = aVar.b().f6149a;
            l.e(latLng2, "localMap.cameraPosition.target");
            try {
                Point point = (Point) p8.c.f0(((c9.d) aVar.c().f13974a).l(latLng2));
                l.e(point, "localMap.projection.toScreenLocation(oldTarget)");
                int i10 = (int) f10;
                int i11 = (int) f11;
                try {
                    LatLng x10 = ((c9.d) aVar.c().f13974a).x(new p8.c(new Point(point.x + i10, point.y + i11)));
                    l.e(x10, "localMap.projection.fromScreenLocation(newPoint)");
                    int i12 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
                    h hVar = h.this;
                    if (i12 >= 0) {
                        left = hVar.getRight();
                    } else {
                        left = hVar.getLeft();
                    }
                    int i13 = left + i10;
                    int i14 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
                    h hVar2 = h.this;
                    if (i14 >= 0) {
                        top = hVar2.getBottom();
                    } else {
                        top = hVar2.getTop();
                    }
                    try {
                        LatLng x11 = ((c9.d) aVar.c().f13974a).x(new p8.c(new Point(i13, top + i11)));
                        l.e(x11, "localMap.projection.from…(edgePointX, edgePointY))");
                        if (Math.abs(x10.f6154b) + Math.abs(x11.f6154b) > Math.abs(x11.f6154b + x10.f6154b)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (i12 > 0) {
                            latLng = latLng2;
                            if (z10 && x10.f6154b > 0.0d) {
                                double d12 = x11.f6154b;
                                if (d12 < 0.0d) {
                                    d10 = -(d12 + 180.0d);
                                }
                            }
                            d10 = 0.0d;
                        } else {
                            latLng = latLng2;
                            if (z10 && x10.f6154b < 0.0d) {
                                double d13 = x11.f6154b;
                                if (d13 > 0.0d) {
                                    d10 = 180.0d - d13;
                                }
                            }
                            d10 = 0.0d;
                        }
                        if (Math.abs(x10.f6153a) + Math.abs(x11.f6153a) > Math.abs(x11.f6153a + x10.f6153a)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (i14 > 0) {
                            if (z11) {
                                d11 = 0.0d;
                                if (x10.f6153a < 0.0d) {
                                    double d14 = x11.f6153a;
                                    if (d14 > 0.0d) {
                                        d11 = 85.0d - d14;
                                    }
                                }
                            } else {
                                d11 = 0.0d;
                            }
                        } else {
                            d11 = 0.0d;
                            if (z11 && x10.f6153a > 0.0d) {
                                double d15 = x11.f6153a;
                                if (d15 < 0.0d) {
                                    d11 = -(d15 + 85.0d);
                                }
                            }
                        }
                        LatLng latLng3 = new LatLng(x10.f6153a + d11, x10.f6154b + d10);
                        if (latLng3.f6153a == latLng.f6153a) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            if (latLng3.f6154b == latLng.f6154b) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (z13) {
                                return false;
                            }
                        }
                        float f12 = aVar.b().f6150b;
                        try {
                            c9.a aVar2 = p.b.f23722a;
                            p.g(aVar2, "CameraUpdateFactory is not initialized");
                            aVar.e(new i(aVar2.q0(latLng3, f12)));
                            return true;
                        } catch (RemoteException e10) {
                            throw new k(e10);
                        }
                    } catch (RemoteException e11) {
                        throw new k(e11);
                    }
                } catch (RemoteException e12) {
                    throw new k(e12);
                }
            } catch (RemoteException e13) {
                throw new k(e13);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context) {
        super(context);
        l.f(context, "context");
        this.f32010d = new a();
        boolean z10 = b9.c.f4039a;
        synchronized (b9.c.class) {
            b9.c.a(context);
        }
        b(this);
    }

    @Override // b9.d
    public final void a(b9.a aVar) {
        this.f32009c = aVar;
        w.d d10 = aVar.d();
        d10.getClass();
        try {
            ((c9.e) d10.f29489a).r();
            this.f32008b = new GestureDetector(getContext(), this.f32010d);
        } catch (RemoteException e10) {
            throw new k(e10);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        l.f(motionEvent, "event");
        GestureDetector gestureDetector = this.f32008b;
        if (gestureDetector != null) {
            gestureDetector.onTouchEvent(motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, GoogleMapOptions googleMapOptions) {
        super(context, googleMapOptions);
        l.f(context, "context");
        this.f32010d = new a();
        boolean z10 = b9.c.f4039a;
        synchronized (b9.c.class) {
            b9.c.a(context);
        }
        b(this);
    }
}
