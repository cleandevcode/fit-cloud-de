package e0;

import a0.b1;
import a0.i0;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.media.Image;
import android.media.ImageWriter;
import android.util.Size;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.List;
import p0.c;
import s.h1;
import y.u0;

/* loaded from: classes.dex */
public final class m implements i0 {

    /* renamed from: k */
    public static final Rect f13310k = new Rect(0, 0, 0, 0);

    /* renamed from: a */
    public final int f13311a;

    /* renamed from: c */
    public int f13313c;

    /* renamed from: g */
    public ImageWriter f13317g;

    /* renamed from: i */
    public c.a<Void> f13319i;

    /* renamed from: j */
    public c.d f13320j;

    /* renamed from: b */
    public final Object f13312b = new Object();

    /* renamed from: d */
    public int f13314d = 0;

    /* renamed from: e */
    public boolean f13315e = false;

    /* renamed from: f */
    public int f13316f = 0;

    /* renamed from: h */
    public Rect f13318h = f13310k;

    public m(int i10, int i11) {
        this.f13313c = i10;
        this.f13311a = i11;
    }

    @Override // a0.i0
    public final void a(int i10, Surface surface) {
        h1.k("YuvToJpegProcessor only supports JPEG output format.", i10 == 256);
        synchronized (this.f13312b) {
            if (this.f13315e) {
                u0.h("YuvToJpegProcessor", "Cannot set output surface. Processor is closed.");
            } else if (this.f13317g != null) {
                throw new IllegalStateException("Output surface already set.");
            } else {
                this.f13317g = f0.a.b(surface, this.f13311a, i10);
            }
        }
    }

    @Override // a0.i0
    public final na.a<Void> b() {
        na.a<Void> f10;
        synchronized (this.f13312b) {
            if (this.f13315e && this.f13316f == 0) {
                f10 = d0.f.e(null);
            } else {
                if (this.f13320j == null) {
                    this.f13320j = p0.c.a(new s.i(3, this));
                }
                f10 = d0.f.f(this.f13320j);
            }
        }
        return f10;
    }

    @Override // a0.i0
    public final void c(Size size) {
        synchronized (this.f13312b) {
            this.f13318h = new Rect(0, 0, size.getWidth(), size.getHeight());
        }
    }

    @Override // a0.i0
    public final void close() {
        c.a<Void> aVar;
        synchronized (this.f13312b) {
            if (this.f13315e) {
                return;
            }
            this.f13315e = true;
            if (this.f13316f != 0 || this.f13317g == null) {
                u0.a("YuvToJpegProcessor", "close() called while processing. Will close after completion.");
                aVar = null;
            } else {
                u0.a("YuvToJpegProcessor", "No processing in progress. Closing immediately.");
                this.f13317g.close();
                aVar = this.f13319i;
            }
            if (aVar != null) {
                aVar.a(null);
            }
        }
    }

    @Override // a0.i0
    public final void d(b1 b1Var) {
        boolean z10;
        ImageWriter imageWriter;
        boolean z11;
        Rect rect;
        int i10;
        int i11;
        androidx.camera.core.j jVar;
        Image image;
        c.a<Void> aVar;
        c.a<Void> aVar2;
        boolean z12;
        c.a<Void> aVar3;
        List<Integer> b10 = b1Var.b();
        boolean z13 = false;
        if (b10.size() == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        StringBuilder a10 = android.support.v4.media.d.a("Processing image bundle have single capture id, but found ");
        a10.append(b10.size());
        h1.e(a10.toString(), z10);
        na.a<androidx.camera.core.j> a11 = b1Var.a(b10.get(0).intValue());
        h1.f(a11.isDone());
        synchronized (this.f13312b) {
            imageWriter = this.f13317g;
            if (!this.f13315e) {
                z11 = true;
            } else {
                z11 = false;
            }
            rect = this.f13318h;
            if (z11) {
                this.f13316f++;
            }
            i10 = this.f13313c;
            i11 = this.f13314d;
        }
        try {
            try {
                jVar = a11.get();
                try {
                } catch (Exception e10) {
                    e = e10;
                    image = null;
                } catch (Throwable th2) {
                    th = th2;
                    image = null;
                }
            } catch (Exception e11) {
                e = e11;
                jVar = null;
                image = null;
            } catch (Throwable th3) {
                th = th3;
                jVar = null;
                image = null;
            }
            if (!z11) {
                u0.h("YuvToJpegProcessor", "Image enqueued for processing on closed processor.");
                jVar.close();
                synchronized (this.f13312b) {
                    if (z11) {
                        int i12 = this.f13316f;
                        this.f13316f = i12 - 1;
                        if (i12 == 0 && this.f13315e) {
                            z13 = true;
                        }
                    }
                    aVar3 = this.f13319i;
                }
                if (z13) {
                    imageWriter.close();
                    u0.a("YuvToJpegProcessor", "Closed after completion of last image processed.");
                    if (aVar3 != null) {
                        aVar3.a(null);
                        return;
                    }
                    return;
                }
                return;
            }
            image = imageWriter.dequeueInputImage();
            try {
                androidx.camera.core.j jVar2 = a11.get();
                try {
                    if (jVar2.getFormat() == 35) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    h1.k("Input image is not expected YUV_420_888 image format", z12);
                    YuvImage yuvImage = new YuvImage(i0.a.c(jVar2), 17, jVar2.f(), jVar2.c(), null);
                    ByteBuffer buffer = image.getPlanes()[0].getBuffer();
                    int position = buffer.position();
                    yuvImage.compressToJpeg(rect, i10, new b0.l(new b(buffer), b0.j.a(jVar2, i11)));
                    jVar2.close();
                    try {
                        buffer.limit(buffer.position());
                        buffer.position(position);
                        imageWriter.queueInputImage(image);
                        synchronized (this.f13312b) {
                            if (z11) {
                                int i13 = this.f13316f;
                                this.f13316f = i13 - 1;
                                if (i13 == 0 && this.f13315e) {
                                    z13 = true;
                                }
                            }
                            aVar2 = this.f13319i;
                        }
                    } catch (Exception e12) {
                        e = e12;
                        jVar = null;
                        if (z11) {
                            u0.c("YuvToJpegProcessor", "Failed to process YUV -> JPEG", e);
                            image = imageWriter.dequeueInputImage();
                            ByteBuffer buffer2 = image.getPlanes()[0].getBuffer();
                            buffer2.rewind();
                            buffer2.limit(0);
                            imageWriter.queueInputImage(image);
                        }
                        synchronized (this.f13312b) {
                            if (z11) {
                                int i14 = this.f13316f;
                                this.f13316f = i14 - 1;
                                if (i14 == 0 && this.f13315e) {
                                    z13 = true;
                                }
                            }
                            aVar2 = this.f13319i;
                        }
                        if (image != null) {
                            image.close();
                        }
                        if (jVar != null) {
                            jVar.close();
                        }
                        if (z13) {
                            imageWriter.close();
                            u0.a("YuvToJpegProcessor", "Closed after completion of last image processed.");
                            if (aVar2 == null) {
                                return;
                            }
                            aVar2.a(null);
                        }
                        return;
                    } catch (Throwable th4) {
                        th = th4;
                        jVar = null;
                        synchronized (this.f13312b) {
                            if (z11) {
                                int i15 = this.f13316f;
                                this.f13316f = i15 - 1;
                                if (i15 == 0 && this.f13315e) {
                                    z13 = true;
                                }
                            }
                            aVar = this.f13319i;
                        }
                        if (image != null) {
                            image.close();
                        }
                        if (jVar != null) {
                            jVar.close();
                        }
                        if (z13) {
                            imageWriter.close();
                            u0.a("YuvToJpegProcessor", "Closed after completion of last image processed.");
                            if (aVar != null) {
                                aVar.a(null);
                            }
                        }
                        throw th;
                    }
                } catch (Exception e13) {
                    e = e13;
                    jVar = jVar2;
                } catch (Throwable th5) {
                    th = th5;
                    jVar = jVar2;
                }
            } catch (Exception e14) {
                e = e14;
            }
            if (z13) {
                imageWriter.close();
                u0.a("YuvToJpegProcessor", "Closed after completion of last image processed.");
                if (aVar2 == null) {
                    return;
                }
                aVar2.a(null);
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }
}
