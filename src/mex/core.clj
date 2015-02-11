(ns mex.core
  (:refer-clojure :exclude [macroexpand-1])
  (:require [cljs.core]
            [cljs.analyzer]))

(defmacro macroexpand-1 [form]
  (let [form (if (and (seq? form) (= 'quote (first form)))
               (second form)
               form)]
    `'~(cljs.analyzer/macroexpand-1 {} form)))
