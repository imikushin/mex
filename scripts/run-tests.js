try {
    require("source-map-support").install();
} catch(err) {
}
require("../target/out/goog/bootstrap/nodejs.js");
require("../target/out/test.js");
goog.require("mex-test");
goog.require("cljs.nodejscli");
