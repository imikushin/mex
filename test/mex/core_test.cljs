(ns mex.core-test
  (:require-macros [mex.core :as mex]
                   [cljs.test :refer [deftest is run-all-tests]])
  (:require [cljs.test]))

; TODO more tests
(deftest simple-expand
  (is (= '(cljs.core/when-not (cljs.core/exists? qq) (def qq :QQ))
        (mex/macroexpand-1 '(defonce qq :QQ)))))

(enable-console-print!)
(set! *main-cli-fn* #(run-all-tests))
