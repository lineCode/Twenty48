// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from twenty_forty_eight.djinni

#import "TFEPlayer+Private.h"
#import "TFEPlayer.h"
#import "DJICppWrapperCache+Private.h"
#import "DJIError.h"
#import "DJIMarshal+Private.h"
#import "TFEPlayer+Private.h"
#include <exception>
#include <utility>

static_assert(__has_feature(objc_arc), "Djinni requires ARC to be enabled for this file");

@interface TFEPlayer ()

- (id)initWithCpp:(const std::shared_ptr<::twentyfortyeight::cpp::Player>&)cppRef;

@end

@implementation TFEPlayer {
    ::djinni::CppProxyCache::Handle<std::shared_ptr<::twentyfortyeight::cpp::Player>> _cppRefHandle;
}

- (id)initWithCpp:(const std::shared_ptr<::twentyfortyeight::cpp::Player>&)cppRef
{
    if (self = [super init]) {
        _cppRefHandle.assign(cppRef);
    }
    return self;
}

+ (nullable TFEPlayer *)create {
    try {
        auto r = ::twentyfortyeight::cpp::Player::Create();
        return ::twentyfortyeight::objc::Player::fromCpp(r);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

- (void)newGame {
    try {
        _cppRefHandle.get()->NewGame();
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

- (int64_t)score {
    try {
        auto r = _cppRefHandle.get()->Score();
        return ::djinni::I64::fromCpp(r);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

- (BOOL)hasWon {
    try {
        auto r = _cppRefHandle.get()->HasWon();
        return ::djinni::Bool::fromCpp(r);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

namespace twentyfortyeight { namespace objc {

auto Player::toCpp(ObjcType objc) -> CppType
{
    if (!objc) {
        return nullptr;
    }
    return objc->_cppRefHandle.get();
}

auto Player::fromCppOpt(const CppOptType& cpp) -> ObjcType
{
    if (!cpp) {
        return nil;
    }
    return ::djinni::get_cpp_proxy<TFEPlayer>(cpp);
}

} }  // namespace twentyfortyeight::objc

@end
