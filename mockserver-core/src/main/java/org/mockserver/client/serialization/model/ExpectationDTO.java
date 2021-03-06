package org.mockserver.client.serialization.model;

import org.mockserver.matchers.TimeToLive;
import org.mockserver.matchers.Times;
import org.mockserver.mock.Expectation;
import org.mockserver.model.*;

/**
 * @author jamesdbloom
 */
public class ExpectationDTO extends ObjectWithJsonToString implements DTO<Expectation> {

    private HttpRequestDTO httpRequest;
    private HttpResponseDTO httpResponse;
    private HttpTemplateDTO httpResponseTemplate;
    private HttpClassCallbackDTO httpResponseClassCallback;
    private HttpObjectCallbackDTO httpResponseObjectCallback;
    private HttpForwardDTO httpForward;
    private HttpTemplateDTO httpForwardTemplate;
    private HttpClassCallbackDTO httpForwardClassCallback;
    private HttpObjectCallbackDTO httpForwardObjectCallback;
    private HttpOverrideForwardedRequestDTO httpOverrideForwardedRequest;
    private HttpErrorDTO httpError;
    private TimesDTO times;
    private TimeToLiveDTO timeToLive;

    public ExpectationDTO(Expectation expectation) {
        if (expectation != null) {
            HttpRequest httpRequest = expectation.getHttpRequest();
            if (httpRequest != null) {
                this.httpRequest = new HttpRequestDTO(httpRequest, httpRequest.getNot());
            }
            HttpResponse httpResponse = expectation.getHttpResponse();
            if (httpResponse != null) {
                this.httpResponse = new HttpResponseDTO(httpResponse);
            }
            HttpTemplate httpResponseTemplate = expectation.getHttpResponseTemplate();
            if (httpResponseTemplate != null) {
                this.httpResponseTemplate = new HttpTemplateDTO(httpResponseTemplate);
            }
            HttpClassCallback httpResponseClassCallback = expectation.getHttpResponseClassCallback();
            if (httpResponseClassCallback != null) {
                this.httpResponseClassCallback = new HttpClassCallbackDTO(httpResponseClassCallback);
            }
            HttpObjectCallback httpResponseObjectCallback = expectation.getHttpResponseObjectCallback();
            if (httpResponseObjectCallback != null) {
                this.httpResponseObjectCallback = new HttpObjectCallbackDTO(httpResponseObjectCallback);
            }
            HttpForward httpForward = expectation.getHttpForward();
            if (httpForward != null) {
                this.httpForward = new HttpForwardDTO(httpForward);
            }
            HttpTemplate httpForwardTemplate = expectation.getHttpForwardTemplate();
            if (httpForwardTemplate != null) {
                this.httpForwardTemplate = new HttpTemplateDTO(httpForwardTemplate);
            }
            HttpClassCallback httpForwardClassCallback = expectation.getHttpForwardClassCallback();
            if (httpForwardClassCallback != null) {
                this.httpForwardClassCallback = new HttpClassCallbackDTO(httpForwardClassCallback);
            }
            HttpObjectCallback httpForwardObjectCallback = expectation.getHttpForwardObjectCallback();
            if (httpForwardObjectCallback != null) {
                this.httpForwardObjectCallback = new HttpObjectCallbackDTO(httpForwardObjectCallback);
            }
            HttpOverrideForwardedRequest httpOverrideForwardedRequest = expectation.getHttpOverrideForwardedRequest();
            if (httpOverrideForwardedRequest != null) {
                this.httpOverrideForwardedRequest = new HttpOverrideForwardedRequestDTO(httpOverrideForwardedRequest);
            }
            HttpError httpError = expectation.getHttpError();
            if (httpError != null) {
                this.httpError = new HttpErrorDTO(httpError);
            }
            Times times = expectation.getTimes();
            if (times != null) {
                this.times = new TimesDTO(times);
            }
            TimeToLive timeToLive = expectation.getTimeToLive();
            if (timeToLive != null) {
                this.timeToLive = new TimeToLiveDTO(timeToLive);
            }
        }
    }

    public ExpectationDTO() {
    }

    public Expectation buildObject() {
        HttpRequest httpRequest = null;
        HttpResponse httpResponse = null;
        HttpTemplate httpResponseTemplate = null;
        HttpClassCallback httpResponseClassCallback = null;
        HttpObjectCallback httpResponseObjectCallback = null;
        HttpForward httpForward = null;
        HttpTemplate httpForwardTemplate = null;
        HttpClassCallback httpForwardClassCallback = null;
        HttpObjectCallback httpForwardObjectCallback = null;
        HttpOverrideForwardedRequest httpOverrideForwardedRequest = null;
        HttpError httpError = null;
        Times times;
        TimeToLive timeToLive;
        if (this.httpRequest != null) {
            httpRequest = this.httpRequest.buildObject();
        }
        if (this.httpResponse != null) {
            httpResponse = this.httpResponse.buildObject();
        }
        if (this.httpResponseTemplate != null) {
            httpResponseTemplate = this.httpResponseTemplate.buildObject();
        }
        if (this.httpResponseClassCallback != null) {
            httpResponseClassCallback = this.httpResponseClassCallback.buildObject();
        }
        if (this.httpResponseObjectCallback != null) {
            httpResponseObjectCallback = this.httpResponseObjectCallback.buildObject();
        }
        if (this.httpForward != null) {
            httpForward = this.httpForward.buildObject();
        }
        if (this.httpForwardTemplate != null) {
            httpForwardTemplate = this.httpForwardTemplate.buildObject();
        }
        if (this.httpForwardClassCallback != null) {
            httpForwardClassCallback = this.httpForwardClassCallback.buildObject();
        }
        if (this.httpForwardObjectCallback != null) {
            httpForwardObjectCallback = this.httpForwardObjectCallback.buildObject();
        }
        if (this.httpOverrideForwardedRequest != null) {
            httpOverrideForwardedRequest = this.httpOverrideForwardedRequest.buildObject();
        }
        if (this.httpError != null) {
            httpError = this.httpError.buildObject();
        }
        if (this.times != null) {
            times = this.times.buildObject();
        } else {
            times = Times.once();
        }
        if (this.timeToLive != null) {
            timeToLive = this.timeToLive.buildObject();
        } else {
            timeToLive = TimeToLive.unlimited();
        }
        return new Expectation(httpRequest, times, timeToLive)
            .thenRespond(httpResponse)
            .thenRespond(httpResponseTemplate)
            .thenRespond(httpResponseClassCallback)
            .thenRespond(httpResponseObjectCallback)
            .thenForward(httpForward)
            .thenForward(httpForwardTemplate)
            .thenForward(httpForwardClassCallback)
            .thenForward(httpForwardObjectCallback)
            .thenForward(httpOverrideForwardedRequest)
            .thenError(httpError);
    }

    public HttpRequestDTO getHttpRequest() {
        return httpRequest;
    }

    public ExpectationDTO setHttpRequest(HttpRequestDTO httpRequest) {
        this.httpRequest = httpRequest;
        return this;
    }

    public HttpResponseDTO getHttpResponse() {
        return httpResponse;
    }

    public ExpectationDTO setHttpResponse(HttpResponseDTO httpResponse) {
        this.httpResponse = httpResponse;
        return this;
    }

    public HttpTemplateDTO getHttpResponseTemplate() {
        return httpResponseTemplate;
    }

    public ExpectationDTO setHttpResponseTemplate(HttpTemplateDTO httpResponseTemplate) {
        this.httpResponseTemplate = httpResponseTemplate;
        return this;
    }

    public HttpClassCallbackDTO getHttpResponseClassCallback() {
        return httpResponseClassCallback;
    }

    public ExpectationDTO setHttpResponseClassCallback(HttpClassCallbackDTO httpObjectCallback) {
        this.httpResponseClassCallback = httpObjectCallback;
        return this;
    }

    public HttpObjectCallbackDTO getHttpResponseObjectCallback() {
        return httpResponseObjectCallback;
    }

    public ExpectationDTO setHttpResponseObjectCallback(HttpObjectCallbackDTO httpObjectCallback) {
        this.httpResponseObjectCallback = httpObjectCallback;
        return this;
    }

    public HttpForwardDTO getHttpForward() {
        return httpForward;
    }

    public ExpectationDTO setHttpForward(HttpForwardDTO httpForward) {
        this.httpForward = httpForward;
        return this;
    }

    public HttpTemplateDTO getHttpForwardTemplate() {
        return httpForwardTemplate;
    }

    public ExpectationDTO setHttpForwardTemplate(HttpTemplateDTO httpForwardTemplate) {
        this.httpForwardTemplate = httpForwardTemplate;
        return this;
    }

    public HttpClassCallbackDTO getHttpForwardClassCallback() {
        return httpForwardClassCallback;
    }

    public ExpectationDTO setHttpForwardClassCallback(HttpClassCallbackDTO httpClassCallback) {
        this.httpForwardClassCallback = httpClassCallback;
        return this;
    }

    public HttpObjectCallbackDTO getHttpForwardObjectCallback() {
        return httpForwardObjectCallback;
    }

    public ExpectationDTO setHttpForwardObjectCallback(HttpObjectCallbackDTO httpObjectCallback) {
        this.httpForwardObjectCallback = httpObjectCallback;
        return this;
    }

    public HttpOverrideForwardedRequestDTO getHttpOverrideForwardedRequest() {
        return httpOverrideForwardedRequest;
    }

    public ExpectationDTO setHttpOverrideForwardedRequest(HttpOverrideForwardedRequestDTO httpOverrideForwardedRequest) {
        this.httpOverrideForwardedRequest = httpOverrideForwardedRequest;
        return this;
    }

    public HttpErrorDTO getHttpError() {
        return httpError;
    }

    public ExpectationDTO setHttpError(HttpErrorDTO httpError) {
        this.httpError = httpError;
        return this;
    }

    public TimesDTO getTimes() {
        return times;
    }

    public ExpectationDTO setTimes(TimesDTO times) {
        this.times = times;
        return this;
    }

    public TimeToLiveDTO getTimeToLive() {
        return timeToLive;
    }

    public ExpectationDTO setTimeToLive(TimeToLiveDTO timeToLive) {
        this.timeToLive = timeToLive;
        return this;
    }
}
