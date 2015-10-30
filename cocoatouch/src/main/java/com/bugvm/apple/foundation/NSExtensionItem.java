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
package com.bugvm.apple.foundation;

/*<imports>*/

import com.bugvm.objc.ObjCRuntime;
import com.bugvm.objc.annotation.NativeClass;
import com.bugvm.objc.annotation.Property;
import com.bugvm.objc.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 8.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Foundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSExtensionItem/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSExtensionItemPtr extends Ptr<NSExtensionItem, NSExtensionItemPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSExtensionItem.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSExtensionItem() {}
    protected NSExtensionItem(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "attributedTitle")
    public native NSAttributedString getAttributedTitle();
    @Property(selector = "setAttributedTitle:")
    public native void setAttributedTitle(NSAttributedString v);
    @Property(selector = "attributedContentText")
    public native NSAttributedString getAttributedContentText();
    @Property(selector = "setAttributedContentText:")
    public native void setAttributedContentText(NSAttributedString v);
    @Property(selector = "attachments")
    public native NSArray<?> getAttachments();
    @Property(selector = "setAttachments:")
    public native void setAttachments(NSArray<?> v);
    @Property(selector = "userInfo")
    public native NSDictionary<?, ?> getUserInfo();
    @Property(selector = "setUserInfo:")
    public native void setUserInfo(NSDictionary<?, ?> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalValue(symbol="NSExtensionItemAttributedTitleKey", optional=true)
    public static native String AttributedTitleKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalValue(symbol="NSExtensionItemAttributedContentTextKey", optional=true)
    public static native String AttributedContentTextKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalValue(symbol="NSExtensionItemAttachmentsKey", optional=true)
    public static native String AttachmentsKey();
    
    
    /*</methods>*/
}