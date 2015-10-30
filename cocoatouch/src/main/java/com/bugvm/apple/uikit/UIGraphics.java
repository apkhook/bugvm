/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.bugvm.apple.uikit;

/*<imports>*/
import com.bugvm.apple.coregraphics.*;
import com.bugvm.apple.foundation.CocoaUtility;
import com.bugvm.apple.foundation.NSMutableData;
import com.bugvm.apple.foundation.NSString;
import com.bugvm.apple.foundation.NSURL;
import com.bugvm.objc.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("UIKit")/*</annotations>*/
@Marshaler(NSString.AsStringMarshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIGraphics/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(UIGraphics.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Bridge(symbol="UIGraphicsGetCurrentContext", optional=true)
    public static native CGContext getCurrentContext();
    @Bridge(symbol="UIGraphicsPushContext", optional=true)
    public static native void pushContext(CGContext context);
    @Bridge(symbol="UIGraphicsPopContext", optional=true)
    public static native void popContext();
    @Bridge(symbol="UIRectFillUsingBlendMode", optional=true)
    public static native void rectFill(@ByVal CGRect rect, CGBlendMode blendMode);
    @Bridge(symbol="UIRectFill", optional=true)
    public static native void rectFill(@ByVal CGRect rect);
    @Bridge(symbol="UIRectFrameUsingBlendMode", optional=true)
    public static native void rectFrame(@ByVal CGRect rect, CGBlendMode blendMode);
    @Bridge(symbol="UIRectFrame", optional=true)
    public static native void rectFrame(@ByVal CGRect rect);
    @Bridge(symbol="UIRectClip", optional=true)
    public static native void rectClip(@ByVal CGRect rect);
    @Bridge(symbol="UIGraphicsBeginImageContext", optional=true)
    public static native void beginImageContext(@ByVal CGSize size);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Bridge(symbol="UIGraphicsBeginImageContextWithOptions", optional=true)
    public static native void beginImageContext(@ByVal CGSize size, boolean opaque, @MachineSizedFloat double scale);
    @Bridge(symbol="UIGraphicsGetImageFromCurrentImageContext", optional=true)
    public static native UIImage getImageFromCurrentImageContext();
    @Bridge(symbol="UIGraphicsEndImageContext", optional=true)
    public static native void endImageContext();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Bridge(symbol="UIGraphicsBeginPDFContextToFile", optional=true)
    public static native boolean beginPDFContextToFile(String path, @ByVal CGRect bounds, CGPDFContextOptions documentInfo);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Bridge(symbol="UIGraphicsBeginPDFContextToData", optional=true)
    public static native void beginPDFContextToData(NSMutableData data, @ByVal CGRect bounds, CGPDFContextOptions documentInfo);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Bridge(symbol="UIGraphicsEndPDFContext", optional=true)
    public static native void endPDFContext();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Bridge(symbol="UIGraphicsBeginPDFPage", optional=true)
    public static native void beginPDFPage();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Bridge(symbol="UIGraphicsBeginPDFPageWithInfo", optional=true)
    public static native void beginPDFPage(@ByVal CGRect bounds, CGPDFBoxOptions pageInfo);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Bridge(symbol="UIGraphicsGetPDFContextBounds", optional=true)
    public static native @ByVal CGRect getPDFContextBounds();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Bridge(symbol="UIGraphicsSetPDFContextURLForRect", optional=true)
    public static native void setPDFContextURLForRect(NSURL url, @ByVal CGRect rect);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Bridge(symbol="UIGraphicsAddPDFContextDestinationAtPoint", optional=true)
    public static native void addPDFContextDestinationAtPoint(String name, @ByVal CGPoint point);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Bridge(symbol="UIGraphicsSetPDFContextDestinationForRect", optional=true)
    public static native void setPDFContextDestinationForRect(String name, @ByVal CGRect rect);
    /*</methods>*/
}