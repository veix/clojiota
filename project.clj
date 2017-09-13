(defproject clojiota "0.1.1-SNAPSHOT"
  :description "A Clojure library built on top of the IOTA Reference Implementation. Adds useful enhancements."
  :url "https://github.com/tuddman/clojiota"
  :license {:name "MIT License"
            :url "https://github.com/tuddman/clojiota/blob/master/LICENSE"}
  :dependencies [[org.clojure/clojure "1.9.0-alpha16"]
                 [org.clojure/tools.cli "0.3.5"]
                 [clj.qrgen "0.4.0"]
                 [com.iota/iri "1.3.2.2"]
                 [com.taoensso/timbre "4.10.0"]
                 [crypto-random "1.2.0"]]
  
  :min-lein-version "2.5.1"
  :main clojiota.core)
