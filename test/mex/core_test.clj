(ns mex.core-test
  (:require [clojure.test :refer :all]
            [cljs.core]
            [mex.core :as mex]))

; TODO more tests
(deftest simple-expand
  (is (= '(cljs.core/when-not (cljs.core/exists? qq) (def qq :QQ))
         (mex/macroexpand-1 '(defonce qq :QQ)))))
