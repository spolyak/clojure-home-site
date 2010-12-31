(defproject clojure-home-site "0.3.0"
  :description "Steve Polyak home site app on Google App Engine"
  :namespaces [stevepolyak.core]
  :dependencies [[compojure "0.5.3"]
                 [ring/ring-servlet "0.3.5"]
                 [hiccup "0.3.1"]
                 [appengine "0.3-SNAPSHOT"]
                 [com.google.appengine/appengine-api-1.0-sdk "1.3.4"]
                 [com.google.appengine/appengine-api-labs "1.3.4"]]
  :dev-dependencies [[swank-clojure "1.2.0"]
                     [ring/ring-jetty-adapter "0.3.5"]
                     [com.google.appengine/appengine-local-runtime "1.3.4"]
                     [com.google.appengine/appengine-api-stubs "1.3.4"]]
  :repositories {"maven-gae-plugin" "http://maven-gae-plugin.googlecode.com/svn/repository"}
  :compile-path "war/WEB-INF/classes"
  :library-path "war/WEB-INF/lib")
