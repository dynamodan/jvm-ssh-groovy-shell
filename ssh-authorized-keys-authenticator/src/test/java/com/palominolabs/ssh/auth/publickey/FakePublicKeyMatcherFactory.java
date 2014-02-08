package com.palominolabs.ssh.auth.publickey;

import javax.annotation.Nonnull;

class FakePublicKeyMatcherFactory implements PublicKeyMatcherFactory {

    @Nonnull
    @Override
    public String getKeyType() {
        return "dummy";
    }

    @Nonnull
    @Override
    public PublicKeyMatcher buildMatcher(byte[] data, String comment) {
        return new FakePublicKeyMatcher(data, comment, false);
    }
}
