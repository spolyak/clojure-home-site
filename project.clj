(defproject stevepolyak "0.1.0-SNAPSHOT"
  :dependencies [
		 [compojure "0.4.0-RC3"]
                 [hiccup "0.2.4"]
                 [org.clojure/clojure "1.2.0"]
                 [org.clojure/clojure-contrib "1.2.0-beta1"]
		 [ring/ring-servlet "0.2.1"]
		 [appengine "0.2"]
		 [com.google.appengine/appengine-api-1.0-sdk "1.4.0"]		 
                 [com.google.appengine/appengine-tools-sdk "1.4.0"]]
  :dev-dependencies [[swank-clojure "1.2.0"]]
  :namespaces [stevepolyak]
  :compile-path "war/WEB-INF/classes/"
  :library-path "war/WEB-INF/lib/")



                 