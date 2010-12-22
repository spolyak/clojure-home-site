(ns stevepolyak
  (:gen-class :extends javax.servlet.http.HttpServlet)
  (:use [stevepolyak.response :only [success]]
        [stevepolyak.templates :only [index new-blog]]	
        [compojure :only [defroutes GET POST]]
        [ring.util.servlet]
	[ring.util.response :only [redirect]])
  (:import (com.google.appengine.api.datastore Query))
  (:require [compojure.route :as route]
            [appengine.datastore.core :as ds]))

(defn create-post [title body]
  "Stores a new post in the datastore and issues an HTTP Redirect to the main page."
  (ds/create-entity {:kind "post" :title title :body body})
  (redirect "/"))

(defroutes app
  ;;  (GET "/*" req (success index)))
  (GET "/" [] (success index))
  (GET "/new" [] (success new-blog))
  (POST "/post" [title body] (create-post title body))
  (route/not-found "Page not found"))

(defservice app)