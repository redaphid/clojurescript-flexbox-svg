(ns clojurescript-flexbox-svg.prod
  (:require [clojurescript-flexbox-svg.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
